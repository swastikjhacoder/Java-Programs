package group2test;

import java.util.Scanner;
import java.util.*;

//class Node<T> {
//	T data;
//	Node next;
//
//	Node(T data) {
//		this.data = data;
//		this.next = null;
//	}
//

//class TreeNode<T> {
//        T data;
//        TreeNode<T> left;
//        TreeNode<T> right;
//
//        TreeNode(T data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    };
//    
//class Height {
//    int height = 0;
//}
//
public class LLtoBST {
//	
//	public static ArrayList<Integer> in = new ArrayList<Integer>();
//	public static ArrayList<Integer> check = new ArrayList<Integer>();
//
//	static Scanner s = new Scanner(System.in);
//
//	public static Node<Integer> takeLLInput() {
//	
//        check.clear();
//		int data = s.nextInt();
//
//		Node<Integer> head = null, tail = null;
//
//		while (data != -1) {
//		check.add(data);
//			Node<Integer> newNode = new Node<Integer>(data);
//
//			if (head == null) {
//				head = newNode;
//				tail = newNode;
//			} else {
//				tail.next = newNode;
//				tail = newNode;
//			}
//
//			data = s.nextInt();
//		}
//
//		return head;
//	}
//
//
//    public static void print(TreeNode<Integer> poi)
//{
//	if(poi==null)
//		return;
//	if(poi.left!=null)
//		print(poi.left);
//	in.add(poi.data);
//	if(poi.right!=null)
//		print(poi.right);
//
//}
//
//public static boolean isValid(TreeNode<Integer> root,Height height)
//{
//	if(root==null)
//	{
//		height.height=0;
//		return true;
//	}
//
//	Height lheight = new Height(), rheight = new Height();
//	
//	boolean l = isValid(root.left, lheight);
//        boolean r = isValid(root.right, rheight);
//        int lh = lheight.height, rh = rheight.height;
//        
//	height.height = (lh > rh ? lh : rh) + 1;
//	
//	 if (Math.abs(lh - rh) >= 2)
//            return false;
//	else
//            return l && r;
//}
//
//	public static void main(String[] args) {
//
//		int t = s.nextInt();
//
//		while (t-- > 0) {
//
//			Node<Integer> head = takeLLInput();
//
//			TreeNode<Integer> root = sortedListToBST(head);
//			TreeNode<Integer> poi=root;
//            in.clear();
//			print(poi);
//			
//			
//        
//			if(in.equals(check)==false)
//    	{
//    		System.out.println("INCORRECT");
//    		continue;
//    	}
//    	
//    	Height h = new Height();
//    	if(isValid(root,h)==false)
//    	{
//    		System.out.println("INCORRECT");
//    		continue;
//    	}
//    	System.out.println("CORRECT");
//
//		}
//
//	}
//	
//	static int countNodes(Node head)
//    {
//        int count = 0;
//        Node temp = head;
//        while (temp != null)
//        {
//            temp = temp.next;
//            count++;
//        }
//        return count;
//    }
//	
//	public static TreeNode<Integer> sortedListToBST(Node<Integer> head) {
//		int n = countNodes(head);
//        return sortedListToBSTRecur(head, n);
//	}
//	
//	public static TreeNode<Integer> sortedListToBSTRecur(Node<Integer> head, int n) {
//		if (n <= 0)
//            return null;
//		TreeNode left = sortedListToBSTRecur(head, n / 2);
//		TreeNode root = new TreeNode(head.data);
//        root.left = left;
//        head = head.next;
//        root.right = sortedListToBSTRecur(head, n - n / 2 - 1);
//        return root;
//	}
}
