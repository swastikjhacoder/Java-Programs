package sortingsearching;

import java.util.Scanner;

public class BubbleSort {

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
    
    public static void bubbleSort(int[] arr){
    	int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){
        	 for(int j=1; j < (n-i); j++){
        		 if(arr[j-1] > arr[j]){
        			 temp = arr[j-1];
                     arr[j-1] = arr[j];
                     arr[j] = temp;
                  }        
             }
         }
    }

	public static void main(String[] args) {
		int[] arr=takeInput();
		bubbleSort(arr);
		printArray(arr);
	}

}
