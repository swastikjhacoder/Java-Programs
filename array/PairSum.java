package array;

import java.util.Scanner;

public class PairSum {

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
    
    public static int pairSum(int arr[], int x) {
    	int count=0;
    	for(int i=0;i<arr.length-1;i++){
	        for(int j=i+1;j<arr.length;j++){
	            if((arr[i]+arr[j])==x) {
	            	count++;
	            }
	        }
	    }
    	return count;
    }
    
	public static void main(String[] args) {
		int[] arr=takeInput();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int val=pairSum(arr,x);
		System.out.println(val);
	}

}
