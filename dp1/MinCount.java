package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinCount {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int minCount(int n) {
		int dp[]=new int[n+1];
		if(n<=3) {
			return n;
		}
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		dp[3]=3;
		for(int i=4;i<=n;i++) {
			int ans=i;
			for(int j=1;j<=Math.sqrt(i);j++) {
				ans =Math.min(ans, dp[i-j*j]+1);
			}
			dp[i]=ans;
		}
		return dp[n];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine().trim());
        System.out.println(minCount(n));
	}
}
