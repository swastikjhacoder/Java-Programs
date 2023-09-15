package array;

import java.util.Scanner;

public class ArrayIntersections {

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
    
    public static void intersections(int arr1[], int arr2[]) {
    	int n=arr1.length;
    	int m=arr2.length;
    	for(int i=0;i<n;i++) {
    		int temp=arr1[i];
    		for(int j=0;j<m;j++) {
    			if(arr2[j]==temp) {
    				System.out.print(arr1[i]+" ");
    				arr2[j]=Integer.MIN_VALUE;
    				break;
    			}
    		}
    	}
    }
   
	public static void main(String[] args) {
		int[] arr1=takeInput();
		int[] arr2=takeInput();
	     //printArray(arr1);
//	     System.out.println(unique);
	     intersections(arr1,arr2);
	}

}
