package array2d;
import java.util.*;
public class TotalSum {

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

	public static void totalSum(int[][] mat) {
		if(mat.length==0)
			return;
		int totalSum = 0;
        for (int i = 0; i < mat.length; i++) {
        	for (int j = 0; j < mat.length; j++) {
        		if (i == j || (i + j) == mat.length - 1) {
        			totalSum += mat[i][j];
                }
        		else if (i == 0 || j == 0 || i == mat.length - 1|| j == mat.length - 1) {
        			totalSum += mat[i][j];
                }
            }
        }
        System.out.println(totalSum);
	}
	
	public static void main(String[] args) {
		int [][]input=takeInput();
	    print2darray(input);
	    totalSum(input);
	}

}
