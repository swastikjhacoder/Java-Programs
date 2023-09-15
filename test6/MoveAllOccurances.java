package test6;

public class MoveAllOccurances {
	
	static Node<Integer> newNode(int x)
    {
        Node<Integer> temp = new Node<>(0);
        temp.data = x;
        temp.next = null;
        return temp;
    }
	
	static void printList(Node<Integer> head)
    {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }
	
	public static Node<Integer> func(Node<Integer> head,int n) 
    {
        Node<Integer> temp1 = head;
        Node<Integer> temp2 = head;
        while (temp2 != null) {
            if (temp2 != temp1 && temp2.data != n) {
            	temp1.data = temp2.data;
            	temp2.data = n;
                temp1 = temp1.next;
            }
            if (temp1.data != n)
            	temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return head;
    }

	public static void main(String[] args) {
		Node<Integer> head = newNode(10);
        head.next = newNode(20);
        head.next.next = newNode(10);
        head.next.next.next = newNode(30);
        head.next.next.next.next = newNode(40);
        head.next.next.next.next.next = newNode(10);
        head.next.next.next.next.next.next = newNode(60);
 
        System.out.printf("Before moveToEnd(), the Linked list is\n");
        printList(head);
 
        int key = 10;
        head = func(head, key);
 
        System.out.printf("\nAfter moveToEnd(), the Linked list is\n");
        printList(head);
	}

}
