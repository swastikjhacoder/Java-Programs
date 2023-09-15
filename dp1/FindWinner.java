package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindWinner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static String findWinner(int n, int x, int y) {
		boolean[] dp = new boolean[n + 1];
        Arrays.fill(dp, false);
        dp[0] = false;
        dp[1] = true;
        for (int i = 2; i <= n; i++) {
            if (i - 1 >= 0 && dp[i - 1] == false)
                dp[i] = true;
            else if (i - x >= 0 && dp[i - x] == false)
                dp[i] = true;
            else if (i - y >= 0 && dp[i - y] == false)
                dp[i] = true;
            else
                dp[i] = false;
        }
        if(dp[n] == true)
        	return "Beerus";
        else
        	return "Whis";
	}

	public static void main(String[] args) throws IOException {
		String[] strNums = br.readLine().trim().split("\\s");
        int n = Integer.parseInt(strNums[0]);
        int x = Integer.parseInt(strNums[1]);
        int y = Integer.parseInt(strNums[2]);

        System.out.println(findWinner(n, x, y));
	}

}
