package group2test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//class QueueEmptyException extends Exception {
//
//}
//
// class QueueUsingLL<T> {
//
//	class Node<T> {
//		T data;
//		Node<T> next;
//		Node(T data){
//			this.data = data;
//		}
//	}
//	
//	private Node<T> head;
//	private Node<T> tail;
//	private int size = 0;
//
//	public int size(){
//		return size;
//	}
//
//	public boolean isEmpty(){
//		if(size == 0){
//			return true;
//		}
//		return false;
//	}
//
//	public T front() throws QueueEmptyException{
//		if(size == 0){
//			QueueEmptyException e = new QueueEmptyException();
//			throw e;
//		}
//
//		return head.data;
//	}
//
//
//	public void enqueue(T element){
//		Node<T> newNode = new Node<T>(element);
//
//		if(head == null){
//			head = newNode;
//			tail = newNode;
//		}
//		else{
//			tail.next = newNode;
//			tail = newNode;
//		}
//
//		size++;
//	}
//
//	public T dequeue() throws QueueEmptyException{
//		if(head == null){
//			QueueEmptyException e = new QueueEmptyException();
//			throw e;
//		}
//		if(head == tail){
//			tail = null;
//		}
//		T temp = head.data;
//		head = head.next;
//		size--;
//		return temp;
//	}
//}
// 
// class BinaryTreeNode<T> {
//		T data;
//		BinaryTreeNode<T> left;
//		BinaryTreeNode<T> right;
//
//		public BinaryTreeNode(T data) {
//			this.data = data;
//			this.left = null;
//			this.right = null;
//		}
//	}
//
//	class Pair<T, U> {
//		T minimum;
//		U maximum;
//
//		public Pair(T minimum, U maximum) {
//			this.minimum = minimum;
//			this.maximum = maximum;
//		}
//
//	}
	
public class MaxSumBST {

//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//	public static BinaryTreeNode<Integer> takeInput() throws NumberFormatException, IOException {
//		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
//		int start = 0;
//
//		String[] nodeDatas = br.readLine().trim().split(" ");
//
//		if (nodeDatas.length == 1) {
//			return null;
//		}
//
//		int rootData = Integer.parseInt(nodeDatas[start]);
//		start += 1;
//
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//		pendingNodes.enqueue(root);
//
//		while(!pendingNodes.isEmpty()){
//			BinaryTreeNode<Integer> currentNode;
//			try {
//				currentNode = pendingNodes.dequeue();
//			} catch (QueueEmptyException e) {
//				return null;
//			}
//
//			int leftChildData = Integer.parseInt(nodeDatas[start]);
//			start += 1;
//
//			if(leftChildData != -1){
//				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
//				currentNode.left = leftChild;
//				pendingNodes.enqueue(leftChild);
//			}
//
//			int rightChildData = Integer.parseInt(nodeDatas[start]);
//			start += 1;
//
//			if(rightChildData != -1){
//				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
//				currentNode.right = rightChild;
//				pendingNodes.enqueue(rightChild);
//			}
//		}
//
//		return root;
//	}
//
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BinaryTreeNode<Integer> root = takeInput();
//        System.out.println(maxSumBST(root)); 
//	}
//
//	static public int maxSumBST(BinaryTreeNode<Integer> root) {
//		INT maxsum = new INT();
//	    maxsum.a = Integer.MIN_VALUE;
//	    return MaxSumBSTUtil(root, maxsum).currmax;
//	}
//	
//	static class Info {
//	    int max;
//	    int min;
//	    boolean isBST;
//	    int sum;
//	    int currmax;
//	     
//	    Info(int m,int mi,boolean is,int su,int cur)
//	    {
//	        max = m;
//	        min = mi;
//	        isBST = is;
//	        sum = su;
//	        currmax = cur;
//	    }
//	    Info(){}
//	};
//	
//	static class INT
//	{
//	    int a;
//	}
//	
//	static Info MaxSumBSTUtil( BinaryTreeNode<Integer> root, INT maxsum){
//	    if (root == null)
//	        return new Info( Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0, 0 );
//	    if (root.left == null && root.right == null) {
//	        maxsum.a = Math.max(maxsum.a, root.data);
//	        return new Info( root.data, root.data, true, root.data, maxsum.a );
//	    }
//	    Info L = MaxSumBSTUtil(root.left, maxsum);
//	    Info R = MaxSumBSTUtil(root.right, maxsum);
//	    Info BST=new Info();
//	    if (L.isBST && R.isBST && L.max < root.data && R.min > root.data) { 
//	        BST.max = Math.max(root.data, Math.max(L.max, R.max));
//	        BST.min = Math.min(root.data, Math.min(L.min, R.min)); 
//	        maxsum.a = Math.max(maxsum.a, R.sum + root.data + L.sum);
//	        BST.sum = R.sum + root.data + L.sum; 
//	        BST.currmax = maxsum.a; 
//	        BST.isBST = true;
//	        return BST;
//	    } 
//	    BST.isBST = false;
//	    BST.currmax = maxsum.a;
//	    BST.sum = R.sum + root.data + L.sum; 
//	    return BST;
//	}
}
