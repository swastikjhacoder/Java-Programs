package test7;

import java.util.Scanner;

public class MaxInvitation {
	
	private static int maxValue(int[][] field) {
	    int r = field.length;
	    int c = field[0].length;
	    int[][] maxValues = new int[r][c];
	    for (int i = 0; i < r; i++) {
	        for (int j = 0; j < c; j++) {
	            if (i == 0 && j == 0) {
	                maxValues[i][j] = field[i][j];
	            } else if (i == 0) {
	                maxValues[i][j] = maxValues[i][j-1] + field[i][j];
	            } else if (j == 0) {
	                maxValues[i][j] = maxValues[i-1][j] + field[i][j];
	            } else {
	                maxValues[i][j] = Math.max(maxValues[i][j-1], maxValues[i-1][j]) + field[i][j];
	            }
	        }
	    }
	    return maxValues[r-1][c-1];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] max = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				max[i][j] = s.nextInt();
			}
		}
		System.out.println(maxValue(max));
		s.close();
	}

}
