package test5;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static LinkedListNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        LinkedListNode<Integer> head = null, tail = null;
        while(data != -1){
        	LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(data);
          if(head == null){
            head = currentNode;
            tail = currentNode;
          }else{
//            Node<Integer> tail = head;
//            while(tail.next != null){
//                tail= tail.next;
//            }
            tail.next= currentNode;
            tail = currentNode;
          }
          data = s.nextInt();
        }
//        s.close();
        return head;
	}
	
	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> slow,LinkedListNode<Integer> fast){
        //Your code goes here
        if (slow==null) return null;
        if (fast.next == null || fast.next.next==null) return slow;
        return midPoint(slow.next,fast.next.next);
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        return midPoint(head,head);
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> A, LinkedListNode<Integer> B) {
        //Your code goes here
        if(A == null) return B;
        if(B == null) return A;

        if(A.data < B.data)
        {
            A.next = mergeTwoSortedLinkedLists(A.next, B);
            return A;
        }
        else
        {
            B.next = mergeTwoSortedLinkedLists(A, B.next);
            return B;
        }
    }

    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head==null || head.next == null) return head;
        LinkedListNode<Integer> midPoint = midPoint(head);
        LinkedListNode<Integer> part1 = sort(midPoint.next);
        midPoint.next = null;
        LinkedListNode<Integer> part2 = sort(head);
        return mergeTwoSortedLinkedLists(part1,part2);
    }
    
    public static void changeLL(LinkedListNode<Integer> head) {
    	Map<Integer, Integer> omap = new HashMap<>();
        LinkedListNode<Integer> temp = head;
        int Num = 0;
        while (temp != null) {
            omap.put(temp.data,(omap.get(temp.data) == null?0:omap.get(temp.data))+1);
            if (Num < temp.data)
            	Num = temp.data;
            temp = temp.next;
        }
        while (head != null) {
        	if (omap.get(head.data) > 1)
                omap.put(head.data, -1);
        	else if (omap.get(head.data) == -1)
                head.data = ++Num;
            head = head.next;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> head = takeInput();
		head = sort(head);
		changeLL(head);
		print(head);
	}

}
