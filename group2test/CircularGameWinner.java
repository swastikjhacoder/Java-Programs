package group2test;

import java.util.Scanner;

class ListNode<t> {
	public t data;
	 public ListNode<t> next;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}

public class CircularGameWinner {
	
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
        int n, k;
        n = s.nextInt();
        k = s.nextInt();
        int ans = findTheWinner(n, k);
        System.out.println(ans);
    }
	
	public static int findTheWinner(int n, int k) {
        CircularLinkedList circularGame = new CircularLinkedList();

        for (int i = 1; i <= n; ++i) {
            circularGame.insert(i);
        }

        int count = k;
        CircularLinkedList.Node currentNode = circularGame.head();
        while (circularGame.hasNotRemainedOne()) {
            CircularLinkedList.Node kNode = circularGame.incrementWithSteps(currentNode, count);
            currentNode = kNode.next;

            circularGame.remove(kNode);
        }

        return circularGame.head().value;
    }
    
    static class CircularLinkedList {
        private Node head;
        private Node tail;
        
        public void insert(int value) {
            Node newNode = new Node(value);
            if (this.head == null) {
                head = newNode;
            } else {
                this.tail.next = newNode;
            }
            this.tail = newNode;
            this.tail.next = head;
        }
        
        public void remove(Node node) {
            if (node == null) {
                return;
            }
            Node currentNode = this.head;
            do {
                if (currentNode.next == node) {
                    currentNode.next = node.next;
                    if (this.head == node) {
                        this.head = this.head.next;
                    }
                    if (this.tail == node) {
                        this.tail = currentNode;
                    }
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != this.head);
        }
        
        public boolean hasNotRemainedOne() {
            return this.head != this.tail;
        }

        public Node incrementWithSteps(Node startNode, int k) {
            if (k == 1) {
                return startNode;
            }
            if (k < 1 || startNode == null) {
                return null;
            }
            Node currentNode = startNode;
            do {
                currentNode = currentNode.next;
                --k;
            } while (k != 1);
            return currentNode;
        }

        public Node head() {
            return this.head;
        }
        
        static class Node {
            public Node next;
            public int value;
            public Node(int value) {
                this.value = value;
                this.next = null;
            }
        }
    }
}
