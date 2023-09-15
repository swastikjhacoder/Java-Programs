package group2test;
import java.util.ArrayList;
import java.util.Scanner;

 class QueueEmptyException extends Exception {
}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

   class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}
   
   
   
public class WarNinjaLand {

	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise(){
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of nodes that are entered themselves but their children aren't added yet
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for(int i = 0 ; i < numChild; i++){
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}


	public static void main(String[] args) {

        TreeNode<Integer> root =  takeInputLevelWise();
        int allowed;
        allowed = s.nextInt();
        int final_ans = minLandingCover(root);
		printAns(allowed, final_ans);

	}
	
	static int ninjaWar(TreeNode<Integer> root, int sum) {
		if(root == null) {
        	return 1;
        }
        if(root.children.size() == 0) {
        	return 0;
        }
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < root.children.size(); i++) {
        	int left = ninjaWar(root.children.get(i), sum);
        	array.add(left);
        }
        for(int i = 0; i < array.size();) {
        	if(array.get(i) == 0) {
        		sum++;
        		return 2;
        	}else if(array.get(i) == 2) {
        		return 1;
        	}else if(array.get(i) == 1) {
        		return 0;
        	}
        }
//        for(int i = 0; i < array.size(); i++) {
//        	if(array.get(i) == 2) {
//        		return 1;
//        	}
//        }
//        for(int i = 0; i < array.size(); i++) {
//        	if(array.get(i) == 1) {
//        		return 0;
//        	}
//        }
		return sum;
	}
	
	static int minLandingCover(TreeNode<Integer> root) {
        int sum = 0;
        if(ninjaWar(root, sum) == 0) {
        	sum++;
        }
        return sum;
    }

    static void printAns(int allowed, int ans)
    {
        if (ans <= allowed)
        {
            System.out.println(ans + " Mission Successful");
        }
        else{
            System.out.println(ans + " Mission Unsuccessful");
        }
    }
}
