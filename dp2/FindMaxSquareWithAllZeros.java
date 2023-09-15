package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMaxSquareWithAllZeros {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static int[][] takeInput() throws IOException {
        String[] nm;
        nm = br.readLine().split("\\s");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
		int arr[][]=new int[n][m];
        if (n == 0) {
            return arr;
        }
		String[] strNums;
        for (int i = 0; i < n; ++i) {            
            strNums = br.readLine().split("\\s");
            for (int j = 0; j < m; ++j){
                arr[i][j] = Integer.parseInt(strNums[j]);
            }            
        }
        return arr;
    }
	
	public static int findMaxSquareWithAllZeros(int[][] input){
		if(input.length == 0 || input[0].length == 0)
			return 0;
		int dp[][] = new int[input.length][input[0].length] ;        
        for(int col = 0 ; col < input[0].length ; col++) {
            if(input[0][col] == 0)
                dp[0][col] = 1 ;
        }
        for(int row = 0; row< input.length ; row++) {
            if(input[row][0] == 0)
                dp[row][0] = 1 ;    
        }
        for(int row = 1 ; row < input.length; row++) {
            for(int col = 1 ; col < input[0].length; col++) {
                if(input[row][col] == 0) {
                    dp[row][col] = Math.min(dp[row-1][col-1], Math.min(dp[row][col-1], dp[row-1][col])) + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < input.length ; i++) {
            for(int j = 0 ; j < input[0].length; j++) {
                if(max < dp[i][j])
                    max = dp[i][j] ;
            }
        }
        return max ;
	}

	public static void main(String[] args) throws IOException {
		int[][] arr = takeInput();
		System.out.println(findMaxSquareWithAllZeros(arr));
	}
}
