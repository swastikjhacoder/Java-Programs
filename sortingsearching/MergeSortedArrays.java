package sortingsearching;

import java.util.Scanner;

public class MergeSortedArrays {

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
    
    public static int[] merge(int arr1[], int arr2[]) {
    	int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
            	arr3[k] = arr1[i];
                i++;
            }
            else
            {
            	arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length)
        {
        	arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length)
        {
        	arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

	public static void main(String[] args) {
		int[] arr1= {1,3,5,7};
		int[] arr2= {2,4,6,8};
		int[] arr3=merge(arr1,arr2);
		printArray(arr3);	
	}
}
