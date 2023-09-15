package array;

import java.util.Scanner;

public class Sort01 {

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
    
    public static void sortZeroesAndOne(int[] arr) {
    	int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index += 1;
            }
        }
    }

	public static void main(String[] args) {
		int[] arr=takeInput();
		sortZeroesAndOne(arr);
		printArray(arr);
	}

}
