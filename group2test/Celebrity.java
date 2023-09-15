package group2test;

import java.util.Scanner;

public class Celebrity {
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.print(celebrity(arr, n));
    }
	
	 public static int celebrity(int[][] arr, int n) {
		 int[] indegree = new int[n];
		 int[] outdegree = new int[n];
	     for (int i = 0; i < n; i++) {
	    	 for (int j = 0; j < n; j++) {
	    		 int x = arr[i][j];
	    		 outdegree[i] += x;
	             indegree[j] += x;
	    	 }
	     }
	     for (int i = 0; i < n; i++)
	    	 if (indegree[i] == n - 1 && outdegree[i] == 0)
	    		 return i;
	     return -1;
	 }
}
