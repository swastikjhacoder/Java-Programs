package sortingsearching;

import java.util.Scanner;

public class SecondLargest {

	public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
	
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    
    public static int secondLargestElement(int[] arr) {
    	int largest=Integer.MIN_VALUE;
    	int second=Integer.MIN_VALUE;
    	for(int i = 0; i < arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
        }
    	for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        return second;
    }

	public static void main(String[] args) {
		int[] arr=takeInput();
		int l2=secondLargestElement(arr);
		System.out.println(l2);
	}

}
