package queue;

public class QueueUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int getSize() { 
		//Implement the getSize() function
		return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
    	return size == 0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
    	Node temp = new Node(data);
		if (size == 0) {
			front = rear = temp;
			size++;
		}else{
		rear.next = temp;
		rear = temp;
		size++;
		}
    }


    public T dequeue() {
    	//Implement the dequeue() function
    	if (size == 0)
			return null;
		T temp = front.data;
		front = front.next;
		size--;
		// if (front == null)
		// 	rear = null;
		return temp;
    }


    public T front() {
    	//Implement the front() function
    	if (front == null) {
			return null;
		}
		return front.data;
    }
}
