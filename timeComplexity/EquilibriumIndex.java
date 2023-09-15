package timeComplexity;
import java.util.Scanner;
public class EquilibriumIndex {

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

    public static int arrayEquilibriumIndex(int[] arr){  
    	int i, j;
    	int lsum, rsum;
    	for (i = 0; i < arr.length; i++) {
    		lsum = 0;
    		for (j = 0; j < i; j++)
    			lsum = lsum + arr[j];
    		rsum = 0;
    		for (j = i + 1; j < arr.length; j++)
    			rsum = rsum + arr[j];
    		if (lsum == rsum)
    			return i;
    	}
    	return -1;
    }

	public static void main(String[] args) {
		int arr[] = takeInput();
		int index = arrayEquilibriumIndex(arr);
		System.out.println(index);
	}

}
