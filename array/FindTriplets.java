package array;

import java.util.Scanner;

public class FindTriplets {

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
	
	public static int findTriplet(int[] arr, int x) {
		int count=0;
		for(int i=0;i<arr.length-2;i++){
	        for(int j=i+1;j<arr.length-1;j++){
	            for(int k=j+1;k<arr.length;k++) {
	            	if(x==arr[i]+arr[j]+arr[k]) {
	            		count++;
	            	}
	            }
	        }
	    }
		return count;
	}
	
	public static void main(String[] args) {
		 int[] arr=takeInput();
		 Scanner s=new Scanner(System.in);
		 int x=s.nextInt();
	     int val=findTriplet(arr,x);
	     System.out.println(val);
	}
}
