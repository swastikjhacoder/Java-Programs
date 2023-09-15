package fulltest3;

import java.util.Scanner;

public class EvenSum {
	
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
	
	static int countWays(int arr[], int N) {
	    int count_even = 0, count_odd = 0;
	    for(int i = 0; i < N; i++) {
	        if (arr[i] % 2 == 1) {
	            count_odd++;
	        }else {
	            count_even++;
	        }
	    }
	    if (count_odd % 2 == 1) {
	        return count_odd;
	    }else {
	        return count_even;
	    }
	}

	public static void main(String[] args) {
		int arr[] = takeInput();
	    int n = arr.length;
	    System.out.print(countWays(arr, n));
	}

}
