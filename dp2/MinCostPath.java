package dp2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MinCostPath {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int mRows = Integer.parseInt(strRowsCols[0]);
        int nCols = Integer.parseInt(strRowsCols[1]);
        if (mRows == 0) {
            return new int[0][0];
        }
        int[][] mat = new int[mRows][nCols];
        for (int row = 0; row < mRows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            for (int col = 0; col < nCols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }
        return mat;
    }
	
	public static int minCostPath(int[][] input) {
		int m = input.length;
        int n = input[0].length;
        int dp[][] = new int[m][n];
        dp[m-1][n-1] = input[m-1][n-1];
        for(int i=m-2;i>=0;i--) {
        	dp[i][n-1] = input[i][n-1] + dp[i+1][n-1];
        }
        for(int j=n-2;j>=0;j--) {
        	dp[m-1][j]= dp[m-1][j+1]+input[m-1][j];
        }
        for(int i=m-2;i>=0;i--) {
            for(int j=n-2;j>=0;j--) {
            	dp[i][j] = input[i][j] + Math.min(dp[i+1][j+1], Math.min(dp[i][j+1], dp[i+1][j]));
            } 
        }
        return dp[0][0];
	}

	public static void main(String[] args) throws IOException {
		int[][] mat = take2DInput();
        System.out.println(minCostPath(mat));
	}

}
