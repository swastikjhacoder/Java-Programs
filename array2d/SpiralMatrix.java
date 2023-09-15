package array2d;
import java.util.*;
public class SpiralMatrix {

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
		System.out.println("Enter the number of rows");
		int rows=s.nextInt();
	    System.out.println("Enter number of cols");
	    int cols=s.nextInt();
	    int[][] arr=new int[rows][cols];
	    for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            System.out.println("Enter the element at "+ i+ " row "+j+"column");
	            arr[i][j]=s.nextInt();
	        }
	    }
	    return arr;
	}

	public static void spiralPrint(int matrix[][]){
		if(matrix.length==0)
			return;
		int i, k = 0, l = 0;
		int m=matrix.length;
		int n=matrix[0].length;
		while (k < m && l < n) {
			for (i = l; i < n; ++i) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(matrix[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
	}
	
	public static void main(String[] args) {
		int [][]input=takeInput();
	    print2darray(input);
	    spiralPrint(input);
	}

}
