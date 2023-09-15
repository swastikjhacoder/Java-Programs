package sortingsearching;

import java.util.Scanner;

public class RotateArray {

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
    
    public static void rotate(int[] arr, int d) {
    	int n=arr.length;
    	int temp[] = new int[n];
        int k = 0;
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

	public static void main(String[] args) {
		int[] arr=takeInput();
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		rotate(arr,d);
		printArray(arr);
	}

}
