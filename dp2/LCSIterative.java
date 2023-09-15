package dp2;

public class LCSIterative {
	
	public static int lcsI(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int[][] dp = new int[m+1][n+1];
		for(int i=m-1; i>=0; i--) {
			for(int j=n-1; j>=0; j--) {
				int ans;
				if(str1.charAt(i) == str2.charAt(j)) {
					ans = 1 + dp[i+1] [j+1];
				}else {
					int ans1 = dp[i][j+1]; 
					int ans2 = dp[i+1][j];
					ans = Math.max(ans1,ans2);
				}
				dp[i][j] = ans;
			}
		}
		return dp[0][0];
	}

	public static void main(String[] args) {
		String str1 = "bedgmc";
		String str2 = "abdfglc";
		int[][] dp= new int[str1.length()+1][str2.length()+1];
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				dp[i][j]=-1;
			}
		}
		int ans = lcsI(str1, str2);
		System.out.println(ans);
	}
}
