package group2test;
import java.io.*;
import java.util.*;

//class Node{
//    int data;
//    Node right,down;
//    Node(int data){
//        this.data=data;
//        right=null;
//        down=null;
//    }
//}
public class MatrixLL {

//	static void display(Node head)
//    {
//        Node rp;
//        Node dp=head;
//        while(dp!=null){
//            rp=dp;
//            while(rp!=null){
//                System.out.print(rp.data+" ");
//                rp=rp.right;
//            }
//            dp=dp.down;
//            System.out.println();
//        }
//        
//    }
//	public static void main (String[] args) {
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int [][]arr=new int[n][n];
//		for(int i=0;i<n;i++)
//		{
//		    for(int j=0;j<n;j++)
//		    arr[i][j]=s.nextInt();
//		}
//		Node head=construct(arr,n);
//		display(head);
//	}
//
//	static Node construct(int arr[][],int n) {
//		Node[][] visited = new Node[n][n];
//        Node head = construct(arr, 0, 0, n, n, visited);
//        return head;
//	}
//	
//	static Node construct(int arr[][], int i, int j, int m, int n, Node[][] visited) {
//		if (i > m - 1 || j > n - 1)
//			return null;
//		if (visited[i][j] != null) {
//			return visited[i][j];
//		}
//		Node temp = new Node(0);
//		visited[i][j] = temp;
//		temp.data = arr[i][j];
//		temp.right = construct(arr, i, j + 1, m, n, visited);
//		temp.down = construct(arr, i + 1, j, m, n, visited);
//		return temp;
//	}
}
