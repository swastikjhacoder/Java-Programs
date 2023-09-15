package array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int count=0;count<t;count++) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=arr[i];
			}
			System.out.println(sum);
		}
	}

}
