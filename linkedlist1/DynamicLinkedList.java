package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DynamicLinkedList {
	
	public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
          Node<Integer> currentNode = new Node<Integer>(data);
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
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		Node<Integer> newNode = new Node<Integer>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        Node<Integer> prev = null;
        Node<Integer> current = head;
        int index = 0;
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (pos > length) {
            return head;
        }
        while (current != null && index < pos) {
            index++;
            prev = current;
            current = current.next;
        }
        prev.next = newNode;
        newNode.next = current;
        return head;
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		if(head == null){
			return head;
		}
		if (pos == 0) {
            head = head.next;
            return head;
        }
        Node<Integer> prev = null;
        Node<Integer> current = head;
        int index = 0;
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (pos >= length) {
            return head;
        }
        while (current != null && index < pos) {
            index++;
            prev = current;
            current = current.next;
        }
        if(prev.next == null) {
        	return head;
        }else {  
	        prev.next = current.next;
	        return head;
        }
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static int findNode(Node<Integer> head, int n) {
		if(head == null){
			return -1;
		}
		int index = 0;
		Node<Integer> temp = head;
		while(temp != null) {
			if(n == temp.data) {
				return index;
			}else {
				index++;
				temp = temp.next;
			}
		}
		return -1;
	}
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		if(head == null){
			return head;
		}
		if(n == 0) {
			return head;
		}else {
			Node<Integer>temp1 = head;
			Node<Integer>temp2 = head;
			Node<Integer>temp = head;
			int length = 0;
			while(temp != null) {
				length++;
				temp = temp.next;
			}
			int i=0;
			while(i < length - n - 1)
			{
				temp1 = temp1.next;
				i++;
			}
			head = temp1.next;
			temp1.next = null;
			Node<Integer> tempHead = head;
			while(tempHead.next != null)
			{
				tempHead = tempHead.next;
			}
			tempHead.next = temp2;
			return head;
		}
	}
	
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		if(head == null || head.next == null)
            return head;
        Node<Integer> prev = head;    
        Node<Integer> p = head.next;
         while(p != null){
            if(p.data.compareTo(prev.data) == 0) {
                prev.next = p.next;
                p = p.next;
            }
            else {
                prev = p;
                p = p.next; 
            }
        }
       return head;
	}
	
	public static void printReverse(Node<Integer> root) {
		if(root == null) {
			return;
		}
		printReverse(root.next);
        System.out.print(root.data + " ");
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		if(head == null) {
			return true;
		}
		Stack<Integer> oStack = new Stack<>();
	    Node<Integer> temp = head;
	    boolean status = false;
	    while (temp != null) {
	      oStack.push(temp.data);
	      temp = temp.next;
	    }
	    temp = head;
	    while (temp != null) {
	      int element = oStack.pop();
	      if (temp.data == element) {
	        status = true;
	        temp = temp.next;
	      } else {
	        status = false;
	        break;
	      }
	    }
	    return status;	
	}
        
	public static void printRecursive(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRecursive(head.next);
	}
	
	public static Node<Integer> insertR(Node<Integer> head, int elem, int pos){
        if(head==null && pos>0){
          return head;
        }
        if(pos==0){
            Node<Integer> newNode= new Node<>(elem);
            newNode.next= head;
            return newNode;
        }else{
        head.next= insertR(head.next, elem, pos-1);
        return head;
        }
    }

	public static Node<Integer> deleteR(Node<Integer> head, int pos){
        if(head==null){
          return head;
        }
        if(pos==0){
            head = head.next;
            return head;
        }else{
	        head.next = deleteR(head.next, pos-1);
	        return head;
        }
    }
	
	public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        Node<Integer> newHeadNode = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHeadNode;
    }
	
	public static Node<Integer> midPoint(Node<Integer> head) {
		if(head == null) {
			return head;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow.next = null;
		return slow;
	}
	
	public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> temp = new Node<Integer>(0);
		Node<Integer> tail = temp;
        while (true) {
        	if (head1 == null) {
                tail.next = head2;
                break;
            }
            if (head2 == null) {
                tail.next = head1;
                break;
            }
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            }
            else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        return temp.next;
    }
	
	public static Node<Integer> mergeSort(Node<Integer> head) {
		if (head == null || head.next == null)
            return head;
  
        Node<Integer> mid = findMid(head);
        Node<Integer> head2 = mid.next;
        mid.next = null;
        Node<Integer> newHead1 = mergeSort(head);
        Node<Integer> newHead2 = mergeSort(head2);
        Node<Integer> finalHead = merge(newHead1, newHead2);
  
        return finalHead;
	}
	
	static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> merged = new Node<Integer>(-1);
        Node<Integer> temp = merged;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }
	
	public static Node<Integer> findMid(Node<Integer> head)
    {
        Node<Integer> slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	
	public static int findNodeRec(Node<Integer> head, int n) {
		return  helper(head,0,n);
	}
	
	public static int helper(Node<Integer> head,int index,int n){
        if(head==null)
        	return -1;
        if(head.data==n)
            return index;
       int ans= helper(head.next,index+1,n);
       return ans;
	}
	
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> evenLLHead = null;
		Node<Integer> oddLLHead = null;
		Node<Integer> evenLLTail = null;
	    Node<Integer> oddLLTail = null;
		while(temp != null) {
			if(temp.data % 2 == 0) {
				if(evenLLHead == null) {
					evenLLHead = evenLLTail = temp;
				}
				else {
					evenLLTail.next = temp;
					evenLLTail = temp;
				}
			}
			else {
				if(oddLLHead == null) {
					oddLLHead = oddLLTail = temp;
				}
				else {
					oddLLTail.next = temp;
					oddLLTail = temp;
				}
			}
			temp = temp.next;
		}
		if(oddLLTail != null && evenLLTail != null) {
			oddLLTail.next = evenLLHead;
			evenLLTail.next = null;
		}else {
			return head;
		}
		return oddLLHead;
	}
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		if(head == null)
            return head;
        if(M == 0)
            return null;
        if(N == 0)
            return head;
        Node<Integer> temp = head, t;
        int count;
        while(temp != null)
        {
        for(count = 1; count < M && temp != null; count++)
        {
        	temp = temp.next;
        }
        if(temp == null)
            return head;
        t = temp.next;
        for(count = 1; count <= N && t != null; count++)
        {
            t = t.next;
        }
        temp.next = t;
        temp = t;}
        return head;
    }
	
	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		if(i > j) {
	        i = i + j;
	        j = i - j;
	        i = i - j;
	    }
		if(i == 0) {
	        if(j == 1) {
	            Node<Integer> current = head.next;
	            head.next = current.next;
	            current.next = head;
	            return current;
	        }
	        Node<Integer> point = head;
	        for(int a = 1; a < j; a++)
	        	point = point.next;
	        
	        Node<Integer>temp = head.next;
	        Node<Integer>current = point.next;
	        
	        head.next = current.next;
	        point.next = head;
	        current.next = temp;
	        return current;
	    }
	    if(j - i == 1) {
	        Node<Integer> point = head;
	        for(int a = 1; a < i; a++)
	        	point = point.next;
	        
	        Node<Integer> current = point.next;
	        Node<Integer> current1 = current.next;
	        
	        current.next = current1.next;
	        point.next = current1;
	        current1.next = current;
	        return head;
	    }
	    Node<Integer> point1 = head;
	    Node<Integer> point2 = head;
	    
	    for(int a = 1; a < i; a++)
	    	point1 = point1.next;
	    
	    for(int a = 1; a < j; a++)
	    	point2 = point2.next;
	    
	    Node<Integer> current1 = point1.next;
	    Node<Integer> current2 = point2.next;
	    
	    Node<Integer> temp = current1.next;
	    
	    current1.next = current2.next;
	    point2.next = current1;
	    point1.next = current2;
	    current2.next = temp;
	    
	    return head;
	}
	
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		if(head == null || k == 0)
	          return head;
		Node<Integer> current = head;
	    Node<Integer> next = null;
	    Node<Integer> prev = null;
	  	int count = 0;
	  	while (count < k && current != null) {
	  		next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	        count++;
	  	}
	  	if (next != null || k > count)
	  		head.next = kReverse(next, k);
	  	return prev;
	}
	
	public static Node<Integer> bubbleSort(Node<Integer> head) {
		if(head == null || head.next == null)
	        return head;
		Node<Integer> current = null, new_head = null, move_node = null, prev = null;
		while (head != null) {
			prev = null;
		    current = head;
		    move_node = head;
		    while (current != null) {
		    	if (current.next != null && current.next.data > move_node.data) {
		    		move_node = current.next;
		            prev = current;
		    	}
		    	current = current.next;
		    }
		    if (move_node == head) {
		    	head = (head).next;
		    }
		    if (prev != null) {
		    	prev.next = move_node.next;
		    }
		    move_node.next = new_head;
		    new_head = move_node;
		}
		return new_head;
	}
	
	public static Node<Integer> nextLargeNumber(Node<Integer> head) {
        Node<Integer> last = null;
        Node<Integer> current = head;
        while (current.next != null) {
            if (current.data != 9) {
                last = current;
            }
            current = current.next;
        }
        if (current.data != 9) {
        	current.data++;
            return head;
        }
        if (last == null) {
            last = new Node<>(0);
            last.next = head;
            head = last;
        }
        last.data++;
        last = last.next;

        while (last != null) {
            last.data = 0;
            last = last.next;
        }
        return head;
    }
	
	public static Node<Integer> sort(Node<Integer> head) {
        if (head==null || head.next == null) 
        	return head;
        Node<Integer> midPoint = midPoint(head);
        Node<Integer> part1 = sort(midPoint.next);
        midPoint.next = null;
        Node<Integer> part2 = sort(head);
        return mergeTwoSortedLinkedLists(part1,part2);
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = takeInput();
//		print(head);
//		int idx = s.nextInt();
//		int val = s.nextInt();
//		Node<Integer> n1 = insert(head, idx, val);
//		print(n1);
//		Node<Integer> n2 = deleteNode(head,idx);
//		print(n2);
//		int value = s.nextInt();
//		int index = findNode(head,value);
//		System.out.println("The node is found at: " + index);
//		Node<Integer> n3 = appendLastNToFirst(head,0);
//		print(n3);
//		Node<Integer> n4 = removeDuplicates(head);
//		print(n4);
//		printReverse(head);
//		System.out.println(isPalindrome(head));
//	    head= insertR(head, 20,2);
//	    print(head);
//	    head = deleteR(head,15);
//	    head = reverseLinkedListRec(head);
//		head = midPoint(head);
//		Node<Integer> head1 = takeInput();
//		head = mergeTwoSortedLinkedLists(head, head1);
//		head = mergeSort(head);
//		System.out.println(findNode(head, -34));
//		head = evenAfterOdd(head);
//		head = skipMdeleteN(head, 2, 2);
//		head = swapNodes(head,0,6);
//		head = kReverse(head,0);
//		head = bubbleSort(head);
//		head = nextLargeNumber(head);
		head = sort(head);
		printRecursive(head);
		s.close();
	}
}
