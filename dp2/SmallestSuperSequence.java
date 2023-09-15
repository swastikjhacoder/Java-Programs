package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestSuperSequence {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int smallestSuperSequence(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int[][] dp = new int[len1+1][len2+1];
	    for(int i=0;i<=len1;i++){
	        dp[i][0]=i;
	    }
	    for(int i=0;i<=len2;i++){
	        dp[0][i]=i;
	    }
	    for(int i = 1; i <= len1; i++){
	        for(int j = 1; j <= len2; j++) {       
	            if(str1.charAt(i-1) == str2.charAt(j-1))
	                dp[i][j] = 1 + dp[i-1][j-1];
	            else
	                dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
	        }
	    }
	    return dp[len1][len2];
	}
	 
	public static void main(String[] args) throws IOException {
		String str1 = br.readLine();
		String str2 = br.readLine();
		int min_len = smallestSuperSequence(str1, str2);
		System.out.print(min_len);
	}

}
