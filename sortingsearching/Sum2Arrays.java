package sortingsearching;

import java.util.Scanner;

public class Sum2Arrays {

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
    
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	int i = arr1.length - 1;
        int j = arr2.length - 1;
        int o = 0;
        int k = Math.max(arr1.length, arr2.length);
        while(i >= 0 && j >= 0)
        {
            int sum = arr1[i] + arr2[j] + o;
            output[k] = sum % 10;
            o = sum / 10;
            i -= 1;
            j -= 1;
            k -= 1;
        } 
        while(i >= 0)
        {
            int sum = arr1[i] + o;
            output[k] = sum % 10;
            o = sum / 10;
            i -= 1; k -= 1;
        }
        while(j >= 0)
        {
            int sum = arr2[j] + o; output[k] = sum % 10;
            o = sum / 10;
            j -= 1;
            k -= 1;
        }
        output[0] = o;
    }

	public static void main(String[] args) {
		int[] arr1=takeInput();
		int[] arr2=takeInput();
		int output_size=-1;
		if(arr1.length>arr2.length)
			output_size=arr1.length+1;
		else
			output_size=arr2.length+1;
		int[] arr3=new int[output_size];
		sumOfTwoArrays(arr1,arr2,arr3);
		printArray(arr3);
	}

}
