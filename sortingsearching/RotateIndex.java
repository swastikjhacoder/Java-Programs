package sortingsearching;

import java.util.Scanner;

public class RotateIndex {

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

    public static int arrayRotateCheck(int[] arr){
    	int index=0;
    	for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                index= i+1;
            }
        }
    	return index;
    }
    
	public static void main(String[] args) {
		int[] arr=takeInput();
		int index=arrayRotateCheck(arr);
		System.out.println(index);
	}

}
