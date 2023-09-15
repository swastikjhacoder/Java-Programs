package array;

import java.util.Scanner;

public class SwapAlternate {
	
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
            System.out.println("Enter element at "+i+"th index");
            arr[i]=s.nextInt();
        }
        return arr;    
    }
    
    public static void swapAlternate(int[] arr){
    	for(int i=0;i<arr.length-1;i=i+2) {
    		for(int j=i+1;j<arr.length;j=j+2) {
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    			System.out.println("("+arr[i]+","+arr[j]+")");
    			break;
    		}
    	}
    }
	
    public static void main(String[] args) {
    	int[] arr=takeInput();
    	swapAlternate(arr);
	     printArray(arr);
	}
}
