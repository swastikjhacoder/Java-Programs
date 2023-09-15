package sortingsearching;

import java.util.Scanner;

public class InsertionSort {

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
    
    public static void insertionSort(int[] arr) {
    	int n = arr.length;
        for (int j = 1; j < n; j++) {
            int temp=arr[j];
            int i=j-1;
            while ((i>-1) && (arr[i]>temp)) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = temp;
        }
    }

	public static void main(String[] args) {
		int[] arr=takeInput();
		insertionSort(arr);
		printArray(arr);
	}

}
