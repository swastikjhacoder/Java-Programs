package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueCollections {
	public static void main(String[] args) {
//		Queue<Integer> queue = new LinkedList<Integer>();
//		queue.add(10);
//		queue.add(20);
//		System.out.println(queue.size());
//		System.out.println(queue.peek());
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
		
//		Queue<Integer> q=new LinkedList<Integer>();
//        for(int i=1;i<5;i++)
//        {
//            q.add(10+i);
//        }
//        System.out.print(q.poll()+" "+q.size());
		
		Queue<Integer> q=new LinkedList<Integer>();
        Stack<Integer> s=new Stack<Integer>();
        q.add(5);
        q.add(10);
        s.push(10);
        s.push(20);
        System.out.print(q.peek()+s.pop());
	}
}
