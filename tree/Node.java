package tree;

class Node<T> {
	T data;
	Node<T> next;
	public Node right;
	
	Node(T data){
		this.data = data;
	}
}
