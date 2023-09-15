package test6;

import java.util.Scanner;

public class RottenOranges {
	
	static int R = 3;
    static int C = 5;

	public static void print2darray(int[][] arr){
		int rows=arr.length;
		int cols=arr[0].length;
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(arr[i][j]+" ");
				}
          System.out.println();
		}
	}
	
	public static int[][] takeInput(){
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
	    int cols=s.nextInt();
	    int[][] arr=new int[rows][cols];
	    for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            arr[i][j]=s.nextInt();
	        }
	    }
	    return arr;
	}
    
    public static boolean isSafe(int i, int j) {
        if (i >= 0 && i < R && j >= 0 && j < C)
            return true;
        return false;
    }
 
    public static int rottenOranges(int v[][]) {
        boolean changed = false;
        int no = 2;
 
        while (true) {
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                	if (v[i][j] == no) {
                        if (isSafe(i + 1, j)
                            && v[i + 1][j] == 1) {
                            v[i + 1][j] = v[i][j] + 1;
                            changed = true;
                        }
                        if (isSafe(i, j + 1)
                            && v[i][j + 1] == 1) {
                            v[i][j + 1] = v[i][j] + 1;
                            changed = true;
                        }
                        if (isSafe(i - 1, j)
                            && v[i - 1][j] == 1) {
                            v[i - 1][j] = v[i][j] + 1;
                            changed = true;
                        }
                        if (isSafe(i, j - 1)
                            && v[i][j - 1] == 1) {
                            v[i][j - 1] = v[i][j] + 1;
                            changed = true;
                        }
                    }
                }
            }
            if (!changed)
                break;
            changed = false;
            no++;
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
            	if (v[i][j] == 1)
                    return -1;
            }
        }
        return no - 2;
    }
    
	public static void main(String[] args) {
		int [][]input = takeInput();
		System.out.println("Max time incurred: " + rottenOranges(input));
	}
}
