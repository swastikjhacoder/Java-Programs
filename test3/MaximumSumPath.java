package test3;

import java.util.Scanner;

public class MaximumSumPath {

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
    
	public static long maximumSumPath(int[] input1, int[] input2) {
		long sum = 0;
        int sum_x = 0, sum_y = 0;
        int m = input1.length, n = input2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (input1[i] < input2[j]) {
                sum_x += input1[i];
                i++;
            } else if (input2[j] < input1[i]) {
                sum_y += input2[j];
                j++;
            } else {
                sum += Math.max(sum_x, sum_y) + input1[i];
                i++;
                j++;
                sum_x = 0;
                sum_y = 0;
            }
        }
        while (i < m) {
            sum_x += input1[i];
            i++;
        }
        while (j < n) {
            sum_y += input2[j];
            j++;
        }
        sum += Math.max(sum_x, sum_y);
        return sum;
    }
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		long result = maximumSumPath(arr1,arr2);
		System.out.println(result);
	}

}
