package dp2;

public class KnapsackIterative {

	public static int knapsackI(int W, int val[], int wt[])  {
		int n = val.length;
		int[][] dp = new int[n+1][W+1];
		for(int i=n-1; i>=0; i--) {
			for(int w=0;w<=W;w++) {
				int ans;
				if(wt[i] <= w) {
					int ans1 = val[i] + dp[i+1][w-wt[i]];
					int ans2 = dp[i+1][w];
					ans = Math.max(ans1, ans2);
				}else {
					ans = dp[i+1][w];
				}
				dp[i][w] = ans;
			}
		}
		return dp[0][W];
	}

	public static void main(String[] args) {
		int val[] = {200, 300, 100};
		int wt[] = {20, 25, 30};
		int W = 50;
		int ans = knapsackI(W,val,wt);
		System.out.println(ans);
	}
}
