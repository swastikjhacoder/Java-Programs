package test4;
import java.util.Scanner;
public class Print2DArrays {
	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[][] input = takeInput();
		print2DArray(input);
	}

	public static void print2DArray(int input[][]) {
		int rc=input.length;
        int cc=input[0].length;
        for(int i=0;i<rc;i++)
        {
        	int n=rc-i;
        	while(n!=0) {
        		for(int j=0;j<cc;j++) {
        			System.out.print(input[i][j]+" ");
        		}
                n--;
                System.out.println("");
        	}
        }
	}
}
