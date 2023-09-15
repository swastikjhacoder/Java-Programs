package sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

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
	
	public static int binarySearch(int[] arr, int x) {
    	int index=Integer.MIN_VALUE;
    	int first=0,last=arr.length-1;
    	int mid = (first + last)/2;  
    	while( first <= last ){  
    		if (arr[mid] < x){  
    	        first = mid + 1;     
    	    }else if (arr[mid] == x){  
    	    	index=mid;  
    	        break;  
    	    }else{  
    	    	last = mid - 1;  
    	    }  
    			mid = (first + last)/2;  
    	    }  
    	    if(first > last){  
    	        index=-1;  
    	    }  
    	return index;
    }

	public static void main(String[] args) {
		int[] arr=takeInput();
//		printArray(arr);
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		Arrays.sort(arr);
		int index=binarySearch(arr,x);
		System.out.println(index);
		s.close();
	}

}
