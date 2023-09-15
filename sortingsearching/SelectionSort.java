package sortingsearching;

import java.util.Scanner;

public class SelectionSort {

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
    
    public static void selectionSort(int[] arr) {
    	for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int num = arr[index];   
            arr[index] = arr[i];  
            arr[i] = num;  
        }  
    }
	
	public static void main(String[] args) {
		int[] arr=takeInput();
		selectionSort(arr);
		printArray(arr);
	}
}
