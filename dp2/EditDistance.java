package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EditDistance {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int editDistance(String s, String t) {
    	int m = s.length();
        int n = t.length();
        if(m == 0 && n == 0)
            return 0;
        if(m == 0)
            return n;
        if(n == 0)
            return m;
        int dp[][] = new int[m+1][n+1];
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++)
        	dp[0][i] = i;
        for(int i = 1; i <= m; i++)
        	dp[i][0] = i;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(s.charAt(m-i) == t.charAt(n-j)) {
                	dp[i][j] = dp[i-1][j-1];
                }else {
                	dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		 String s = br.readLine().trim();
		 String t = br.readLine().trim();
		 System.out.println(editDistance(s, t));
	}

}
