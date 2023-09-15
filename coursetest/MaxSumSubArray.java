package coursetest;
import java.util.Scanner;
public class MaxSumSubArray {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int maxSum = maxSubarraySum(arr, k);
        System.out.println(maxSum);
    }

    public static int maxSubarraySum(int arr[], int k){
        
        int cumlativeSum[] = new int[arr.length];
        cumlativeSum[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            cumlativeSum[i] = cumlativeSum[i-1] + arr[i];
        }
        
        int maxSum = cumlativeSum[k-1];
        int sum = 0;
        for(int i = k; i<arr.length; i++){
            sum = cumlativeSum[i] - cumlativeSum[i-k];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
