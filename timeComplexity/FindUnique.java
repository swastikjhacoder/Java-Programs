package timeComplexity;
import java.util.Scanner;
public class FindUnique {

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
	
    public static int findUniqueInArray(int[] arr) {
    	int n = arr.length;
     	mergeSort(arr,0,n-1);
     	
//    	for(int i=0;i<arr.length;i++){
//    		int cnt = 0;
//            for(int j=0;j<arr.length;j++){
//                if((arr[i]^arr[j]) == 0) {
//                	cnt += 1;
//                }
//            }
//            if(cnt == 1)
//            	return arr[i];
//        }
//        return 0;
     	
     	int XOR = 0;
		for (int i = 0; i < arr.length; i++) {
			XOR ^= arr[i];
		}
		return XOR;
    }

	public static void main(String[] args) {
		int[] arr=takeInput();
	     //printArray(arr);
	     int unique=findUniqueInArray(arr);
	     System.out.println(unique);
	}

}
