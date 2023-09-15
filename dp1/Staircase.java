package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int staircaseRecursion(int n){
	       if(n < 0)
	         return 0;
	       if(n == 0)
	         return 1 ;
	       return staircaseRecursion(n - 3) + staircaseRecursion(n - 2) + staircaseRecursion(n -1);
		}
	
	public static long staircase(int n) {
		long dp[] = new long[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2; i<dp.length; i++) {
			long op2 = 0, op3 = 0;
			long op1 = dp[i-1];
			if(i - 2 >= 0)
			 op2 = dp[i-2];
			if(i - 3 >= 0)
			 op3=dp[i-3];
			dp[i]=op1 + op2 + op3;
		}
		return dp[n];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine().trim());
        System.out.println(staircase(n));
	}

}
