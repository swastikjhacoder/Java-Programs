package queue;
import java.util.*;
public class StackUse {
	private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;
	
	public StackUse() {
        //Implement the Constructor
		q1 = null;
		q2 = null;
		size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
    	return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
    	if(q1.size() == 0) {
    		return true;
    	}else { return false;}
    }

    public void push(int element) {
        //Implement the push(element) function
    	q2.add(element);
    	while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
    	Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    public int pop() {
        //Implement the pop() function
    	if (q1.isEmpty())
            return -1;
        return q1.remove();
    }

    public int top() {
        //Implement the top() function
    	if (q1.isEmpty())
            return -1;
        return q1.peek();
    }
}
