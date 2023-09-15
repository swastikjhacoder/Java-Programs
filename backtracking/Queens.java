package backtracking;

import java.util.Scanner;

public class Queens {

	static int[][] board = new int[10][10];

	private static boolean isPossible(int n,int row,int col) {
	  for(int i=row-1;i>=0;i--) {
	    if(board[i][col] == 1) {
	      return false;
	    }
	  }
	  for(int i=row-1,j=col-1;i>=0 && j>=0 ; i--,j--) {
		  if(board[i][j] ==1){
			  return false;
	    }
	  }
	  for(int i=row-1,j=col+1;i>=0 && j<n ; i--,j++) {
	    if(board[i][j] == 1) {
	    	return false;
	    }
	  }
	  return true;
	}
	
	private static void nQueenHelper(int n,int row) {
		if(row==n){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println();
			return;
		}
		for(int j=0;j<n;j++) {
			if(isPossible(n,row,j)) {
				board[row][j] = 1;
				nQueenHelper(n,row+1);
				board[row][j] = 0;
			}
		}
		return;
	}
	
	public static void placeNQueens(int n){
		board = new int[n][n];
		nQueenHelper(n,0);
	}

    public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		placeNQueens(n);
		s.close();
    }
}