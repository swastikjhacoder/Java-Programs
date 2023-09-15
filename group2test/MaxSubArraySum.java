package group2test;
import java.util.*;
import java.lang.*;
import java.io.*;
public class MaxSubArraySum {
	public static int maxSubarraySum(int[] arr, int n) {
		int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i: arr) {
            maxEndingHere = maxEndingHere + i;
            maxEndingHere = Integer.max(maxEndingHere, 0);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		long ans = maxSubarraySum(arr, n);
		System.out.println(ans);
    }
}
