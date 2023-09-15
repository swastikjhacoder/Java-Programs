package priorityqueue;

public class Priority_Queue_Use {

	public static void main(String[] args) throws PriorityQueueEmptyException {
		Priority_Queue<String> pq = new Priority_Queue<>();
		pq.insert("A", 15);
		pq.insert("B", 13);
		pq.insert("C", 90);
		pq.insert("D", 150);
		pq.insert("E", 120);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMinimum());
			pq.removeMin();
		}
	}

}
