package LinkedList;

import java.util.Scanner;

public class LinkedListUse {
	
	public static int count = 0;
	
	public static Node<Integer> linkedListUse(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
	}
	
	public static Node<Integer> Increment(Node<Integer> head, int val){
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data = temp.data + val;
			temp = temp.next;
		}
		return temp;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static int length(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void printIthNode(Node<Integer> head, int i){
		int n = 0;
		while(head != null) {
			if(n == i) {
				System.out.println(head.data);
			}
			head = head.next;
			n++;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		Node<Integer> head = linkedListUse();
		Increment(head, val);
		print(head);
		int length = length(head);
		System.out.println(length);
		int index = s.nextInt();
		printIthNode(head, index);
		s.close();
	}
}
