package group2test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class BetweenLL {
	
	public static LinkedListNode<Integer> mergeInBetween(LinkedListNode<Integer> list1, int a, int b, LinkedListNode<Integer> list2) {
		LinkedListNode<Integer> head = null, last = null;
	    int i = 1;
	    LinkedListNode<Integer> t = list1;
	    while(t != null){
	        if(i == a){
	            head = t;
	        }
	        if(i == b + 1){
	            last = t.next;
	            break;
	        }
	        t = t.next;
	        i++;
	    }
	    head.next = list2;
	    while(head.next != null){
	        head = head.next;
	    }
	    head.next = last;
	    return list1;
	}

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        
           
        LinkedListNode<Integer> head1 = takeInput();
        String[] strNums = br.readLine().trim().split(" ");
        int a = Integer.parseInt(strNums[0]);
        int b = Integer.parseInt(strNums[1]);
        LinkedListNode<Integer> head2 = takeInput();

        LinkedListNode<Integer> newHead = mergeInBetween(head1, a, b, head2);
        print(newHead);
        


    }

}
