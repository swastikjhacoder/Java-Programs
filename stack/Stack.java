package stack;

public class Stack {
	private Node head;
	private int size;
	private Node tail;
    
	public Stack() {
        //Implement the Constructor
		head= null;
	    size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
    	return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
    	if(size==0) return true;
        else return false;
    }

    public void push(int element) {
        //Implement the push(element) function
    	Node newNode = new Node(element);
        newNode.next = head;
        head= newNode;
        size++;
    }

    public int pop() throws StackEmptyException {
        //Implement the pop() function
    	if(head==null){
    	      throw new StackEmptyException();
    	  }
    	  //since we are pushing data in the front so the so we must remove the data from the front itself
    	  int temp = (int) head.data;
    	  head = head.next;
    	  size--;
    	  return temp;
    }

    public int top() throws StackEmptyException {
        //Implement the top() function
    	if(head==null){
    	      throw new StackEmptyException();
    	  }
    	  return (int) head.data;
    }
}
