package graph1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConnectingDots {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 public static String[] takeInput() throws IOException {
		 String[] strNums;
	     strNums = br.readLine().split("\\s");
	     int N = Integer.parseInt(strNums[0]);
//	     int M = Integer.parseInt(strNums[1]);
	     String[] Graph = new String[N];
	     for (int i = 0; i < N; ++i) {
	    	 Graph[i] = br.readLine();
	     }
	     return Graph;
	 }
	 
	 static int solve(String[] board , int n, int m) {
		 boolean[][] visited = new boolean[n][m];
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<m;j++) {
				 if(!visited[i][j]) {
					 if(hasCycle(board,-1,-1,i,j,visited)==1) {
						 return 1;
					 }
				 }
			 }
		 }
		 return 0;
	 }
	 
	 public static int hasCycle(String[] board, int fromX, int fromY, int i, int j, boolean[][] visited) {
		if(visited[i][j]) {
			return 1;
		}
		int[] X_dir = {1,0,0,-1};
		int[] Y_dir = {0,1,-1,0};
		visited[i][j] = true;
		for(int l=0;l<X_dir.length;l++) {
			int x = X_dir[l] + i;
			int y = Y_dir[l] + j;
			if( x==fromX && y == fromY ) {
				continue;
			}		
			if( x>=0 && y>=0 && x<board.length && y<board[x].length() && board[x].charAt(y) == board[i].charAt(j) ) {
				int ans = hasCycle(board, i, j, x, y, visited);
				if(ans == 1) {
					return 1;
				}
			}
		}
		return 0;	
	 }
	 
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 String[] Graph = takeInput();
		 if (solve(Graph,Graph.length,Graph[0].length())==1){
			 System.out.print("true");
		 }else {
			 System.out.print("false");
		 }
	}
}
