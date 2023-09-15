package test6;

public class Multiply2LinkedList {
	
	public static Node<Integer> createNode(int data,Node<Integer> start){
		Node<Integer>p=new Node<>(0);
		p.data=data;
		p.next=null;
		Node<Integer>temp=start;
		if(start==null){
			start=p;
			start.next=null;
		}else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=p;
		}
		return start;
	}
	
	public static void multiply(Node<Integer> head1, Node<Integer> head2) {
//		Node<Integer> p = head1;
//		int x = 0, y = 0;
//		while(p != null){
//			x = x * 10 + p.data;
//			p = p.next;
//		}
//		p = head2;
//		while(p != null){
//			y = y * 10 + p.data;
//			p = p.next;
//		}
//		System.out.println(x * y);
		
		
	}
			      
	public static void main(String[] args) {
		Node<Integer> head1 = null;
		head1 = createNode(1,head1);
		head1 = createNode(0,head1);
		head1 = createNode(1,head1);
//		head1 = createNode(4,head1);
//		head1 = createNode(5,head1);
		Node<Integer> head2 = null;
		head2 = createNode(1,head2);
		head2 = createNode(2,head2);
		head2 = createNode(3,head2);
		head2 = createNode(4,head2);
		head2 = createNode(5,head2);
		
//		cout<<"LinkList 1"<<endl;
//		printNode(head1);
//		cout<<"\nLinkList 2"<<endl;
//		printNode(head2);
//		cout<<endl;
		multiply(head1,head2);
//		cout<<"Multiplication is : "<<ans;
	}

}
