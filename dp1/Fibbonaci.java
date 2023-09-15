package dp1;

import java.util.Scanner;

public class Fibbonaci {
	
	private static void printSeries(int[] dp) {
		for(int i = 0; i< dp.length; i++) {
			System.out.print(dp[i] + " ");
		}
	}
	
	public static int fibIterative(int n) {
		if(n == 0 || n ==1) {
			return n;
		}
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		printSeries(dp);
		System.out.print("\n");
		return dp[n];
	}
	
	public static int fib(int n, int[] dp) {
		if(n == 0 || n == 1) {
			return n;
		}
		int ans1 = 0, ans2 = 0;
		if(dp[n-1] == -1) {
			ans1 = fib(n-1, dp);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		if(dp[n-2] == -1) {
			ans2 = fib(n-2, dp);
			dp[n-2] = ans2;
		}else {
			ans2 = dp[n-2];
		}
		int result = ans1 + ans2;
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//First process....
		
		int[] dp = new int[n];
		for(int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		int output1 = fib(n, dp);
		System.out.println(output1);
		
		//Second process...
		
		int output2 = fibIterative(n);
		System.out.println(output2);
		s.close();
	}
}