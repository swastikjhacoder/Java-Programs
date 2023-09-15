package recursion2;
import java.util.*;
public class mergeSort {
	public static void intArraymergeSort(int[] input) { 
        if(input == null) { 
            return; 
        } 
          if(input.length > 1) { 
            int mid = input.length / 2;
            int[] left = new int[mid]; 
            for(int i = 0; i < mid; i++) { 
                left[i] = input[i]; 
            } 
            int[] right = new int[input.length - mid]; 
            for(int i = mid; i < input.length; i++) { 
                right[i - mid] = input[i]; 
            }
            intArraymergeSort(left); 
            intArraymergeSort(right);
   
            int i = 0; 
            int j = 0; 
            int k = 0;
            while(i < left.length && j < right.length) { 
                if(left[i] < right[j]) { 
                	input[k] = left[i]; 
                    i++; 
                } 
                else { 
                	input[k] = right[j]; 
                    j++; 
                } 
                k++; 
            } 
            while(i < left.length) { 
            	input[k] = left[i]; 
                i++; 
                k++; 
            } 
            while(j < right.length) { 
            	input[k] = right[j]; 
                j++; 
                k++; 
            } 
        } 
    }
	
	public static void main(String[] args) {
		int numArray[] = {10, 23, -11, 54, 2, 9, -10, 45};
        System.out.println("Original Array:" + Arrays.toString(numArray));
        intArraymergeSort(numArray); 
        System.out.println("Sorted array:" + Arrays.toString(numArray)); 
	}

}
