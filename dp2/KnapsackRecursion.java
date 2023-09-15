package dp2;

public class KnapsackRecursion {

	public static int knapsack(int W, int val[], int wt[], int i) {

		if(i==val. length) {
			return 0;
		}
		int ans;
		if(wt[i] <= W) {
			int ans1 = val[i] + knapsack (W-wt[i],val, wt, i+1);
			int ans2 = knapsack (W,val, wt, i+1);
			ans = Math.max(ans1, ans2);
		}else {
			ans = knapsack(W, val,wt,i+1);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int val[] = {200, 300, 100};
		int wt[] = {20, 25, 30};
		int W = 50;
		int ans = knapsack(W,val,wt, 0);
		System.out.println(ans);
	}
}
