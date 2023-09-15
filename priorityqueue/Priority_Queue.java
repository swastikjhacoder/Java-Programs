package priorityqueue;

import java.util.ArrayList;

public class Priority_Queue<T> {
	private ArrayList<Element<T>> heap;
	
	public Priority_Queue() {
		heap = new ArrayList<>();
	}
	
	public void insert(T value, int priority) {
		Element<T> e = new Element<>(value, priority);
		heap.add(e);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		while(childIndex > 0) {
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else {
				return;
			}
		}
	}
	
	public T getMinimum() throws PriorityQueueEmptyException {
		if(isEmpty()) {
			throw new PriorityQueueEmptyException();
		}
		return heap.get(0).value;
	}
	
	public T removeMin() throws PriorityQueueEmptyException {
		if(isEmpty()){
			// Throw an exception
			throw new PriorityQueueEmptyException();
		}
		Element<T> temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int parentindex = 0;
		int minIndex = parentindex;
		int leftChildIndex = 1;
		int rightChildIndex = 2;

		while(leftChildIndex < heap.size()){

			if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority){
				minIndex = rightChildIndex;
			}
			if(minIndex == parentindex){
				break;
			}else{
				Element<T> temp1 = heap.get(parentindex);
				heap.set(parentindex, heap.get(minIndex));
				heap.set(minIndex, temp1);
				parentindex = minIndex;
				leftChildIndex = 2 * parentindex + 1;
				rightChildIndex = 2 * parentindex + 2;
			}
		}
		return (T) temp;
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
	}
}

/*import java.util.ArrayList;

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}
    
    public void downHeapify()
    {
        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;
        int minIndex = 0;
        while(leftChildIndex<heap.size()){
            
            if(heap.get(leftChildIndex) < heap.get(minIndex) ) {
				minIndex = leftChildIndex;
			}
            if( rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex) ) {
				minIndex = rightChildIndex;
			}
            if(minIndex!=parentIndex) {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(minIndex));
				heap.set(minIndex,  temp );
				parentIndex = minIndex;
				leftChildIndex = 2*parentIndex + 1;
				rightChildIndex = 2*parentIndex + 2;
			}else {
				break;
			}
        }
        
    }
	int removeMin()throws PriorityQueueException {
		// Complete this function
		// Throw the exception PriorityQueueException if queue is empty
        if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
        //save the head/smallest element in minPriority Queue
        int minElement = heap.get(0);
         //Set the last priority element as the new root
        heap.set(0, heap.get(heap.size()-1));
        //Remove the last priority element
        heap.remove(heap.size()-1);
        //now lets do down heapify to maintain the properties of heap.
        downHeapify();
        return minElement;
	}
}

class PriorityQueueException extends Exception {

}*/
