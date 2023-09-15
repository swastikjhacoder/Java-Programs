package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsetPresent {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static boolean isSubsetSumDP(int[] arr, int n, int sum) {
		if (sum == 0) {
            return true;
        }
        if (n <= 0 && sum != 0) {
            return false;
        }
        return isSubsetSumDP(arr, n - 1, sum) || isSubsetSumDP(arr, n - 1, sum - arr[n - 1]);
	}
	
	public static boolean isSubsetPresent(int[] arr, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= sum; i++) {
            dp[0][i] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        return dp[n][sum];
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];
        if (size == 0) {
            System.out.print("No");
            return;
        }  
		String[] strNums;
		strNums = br.readLine().split("\\s");		
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }
        int sum = Integer.parseInt(br.readLine().trim());
        if (isSubsetPresent(input,size,sum)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
	}
}
