package queue;

public class QueueUse {
	public static void main(String[] args) throws QueueFullException {
//		QueueUsingArray queue = new QueueUsingArray();
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		int[] arr = { 10, 20, 30, 40 };
		for(int elem : arr) {
			queue.enqueue(elem);
		}
		
		if(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}