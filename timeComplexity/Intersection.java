package timeComplexity;
import java.util.Scanner;
public class Intersection {

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


	public static void merge(int array[], int p, int q, int r) {
	    int n1 = q - p + 1;
	    int n2 = r - q;
	    int L[] = new int[n1];
	    int M[] = new int[n2];
	    for (int i = 0; i < n1; i++)
	      L[i] = array[p + i];
	    for (int j = 0; j < n2; j++)
	      M[j] = array[q + 1 + j];
	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = p;
	    while (i < n1 && j < n2) {
	      if (L[i] <= M[j]) {
	        array[k] = L[i];
	        i++;
	      } else {
	        array[k] = M[j];
	        j++;
	      }
	      k++;
	    }
	    while (i < n1) {
	      array[k] = L[i];
	      i++;
	      k++;
	    }

	    while (j < n2) {
	      array[k] = M[j];
	      j++;
	      k++;
	    }
	  }

	public static void mergeSort(int array[], int left, int right) {
	    if (left < right) {
	      int mid = (left + right) / 2;
	      mergeSort(array, left, mid);
	      mergeSort(array, mid + 1, right);
	      merge(array, left, mid, right);
	    }
	  }
	  
    public static void intersect(int[] arr1, int[] arr2) {
    	int n = arr1.length;
     	int m = arr2.length;
     	
     	mergeSort(arr1,0,n-1);
     	mergeSort(arr2,0,m-1);
        
     	int i = 0, j = 0;
     	while (i < n && j < m) {
            if (arr1[i] < arr2[j])
               i++;
            else if (arr2[j] < arr1[i])
               j++;
            else {
               System.out.print(arr2[j++]+" ");
               i++; 
            }
         }
    }
    
	public static void main(String[] args) {
		int[] arr1=takeInput();
		int[] arr2=takeInput();
//		printArray(arr1);
//		printArray(arr2);
		intersect(arr1,arr2);
	}

}
