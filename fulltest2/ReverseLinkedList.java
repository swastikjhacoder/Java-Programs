package fulltest2;

import java.util.Scanner;

public class ReverseLinkedList {
	static Node head;
	public static void main(String[] args) {
		 Scanner s=new Scanner (System.in);
	        int n=s.nextInt();
	        int a=s.nextInt();
	        Node head=new Node(a);
	        Node prev=head;
	        for(int i=0;i<n-1;i++)
	        {
	            a=s.nextInt();
	            Node newnode=new Node(a);
	            prev.next=newnode;
	            prev=newnode;
	        }
	        int k=s.nextInt();
	        Node ans=reverse(head,k);
	        prev=ans;
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(prev.data+" ");
	            prev=prev.next;
	        }
	}

	public static Node reverse(Node head, int k) {
		if (head == null) {
            return null;
        }
        Node current = head;
        Node prev = null;
        int count = 0;
        while (current != null && count++ < k) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = reverse(current, k);
        return prev;
	}
	
}
