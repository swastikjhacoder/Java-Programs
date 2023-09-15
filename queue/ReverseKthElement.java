package queue;
import java.util.*;
public class ReverseKthElement {

	static Queue<Integer> reverseFirstK(Queue<Integer> input, int k) {
	       solve(input, k);
	       int s = input.size() - k;
	       while( s-- > 0){
	           int x = input.poll();
	           input.add(x);
	       }
	       return input;
	   }
	   static void solve(Queue<Integer> q, int k){
	       if(k == 0) return;
	       int e = q.poll();
	       solve(q, k - 1);
	       q.add(e);
	   }
	   
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
	       queue.add(10);
	       queue.add(20);
	       queue.add(30);
	       queue.add(40);
	       queue.add(50);
	       queue.add(60);
	       queue.add(70);
	       queue.add(80);
	       queue.add(90);
	       queue.add(100);
	 
	       int k = 5;
	       queue = reverseFirstK(queue, k);
	       // printing queue
	      while (!queue.isEmpty()) {
	           System.out.print(queue.poll() + " ");
	       }
	}

}
