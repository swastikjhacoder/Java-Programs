package group2test;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class QueueEmptyException extends Exception {
//}
//
//class Queue<T> {
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
//class BinaryTreeNode<T> {
//	T data;
//	BinaryTreeNode<T> left;
//	BinaryTreeNode<T> right;
//
//	public BinaryTreeNode(T data) {
//		this.data = data;
//	}
//}
public class SymmetricBinaryTree {
//	static Scanner s = new Scanner(System.in);
//
//	public static BinaryTreeNode<Integer> takeInput(){
//		Queue<BinaryTreeNode<Integer>>  pendingNodes = new Queue<BinaryTreeNode<Integer>>(); // we can skip writing again inside <> after java version 1.7 
//		int rootData = s.nextInt();
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
//			int leftChildData = s.nextInt();
//			if(leftChildData != -1){
//				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
//				currentNode.left = leftChild;
//				pendingNodes.enqueue(leftChild);
//			}
//			int rightChildData = s.nextInt();
//			if(rightChildData != -1){
//				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
//				currentNode.right = rightChild;
//				pendingNodes.enqueue(rightChild);
//			}
//		}
//		return root;
//	}
//	
//	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = takeInput();
//		System.out.println(isSymmetric(root));
//	}
//	
//	public static boolean isMirror(BinaryTreeNode<Integer> node1, BinaryTreeNode<Integer> node2){
//		if (node1 == null && node2 == null)
//            return true;
//        if (node1 != null && node2 != null && node1.data == node2.data)
//            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
//        return false;
//	}
//	
//	public static boolean isSymmetric(BinaryTreeNode<Integer> root){
//		return isMirror(root, root);
//	}
}
