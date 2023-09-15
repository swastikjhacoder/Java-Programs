package array;

import java.util.Scanner;

public class ArrangeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int val1=1;
		int val2=n;
		if(n%2==0) {
			for(int i=0;i<=(n-1)/2;i++) {
				arr[i]=val1;
				val1=val1+2;
			}
			for(int i=n/2;i<n;i++) {
				arr[i]=val2;
				val2=val2-2;
			}
		}else {
			for(int i=0;i<=n/2;i++) {
				arr[i]=val1;
				val1=val1+2;
			}
			for(int i=n/2+1;i<n;i++) {
				arr[i]=val2-1;
				val2=val2-2;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
