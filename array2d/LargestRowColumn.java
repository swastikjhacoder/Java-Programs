package array2d;
import java.util.*;
public class LargestRowColumn {

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
	
	public static void findLargest(int mat[][]) {
		if(mat.length==0) {
			System.out.println("row 0 "+Integer.MIN_VALUE);
			return;
		}
		int rows=mat.length;
        int cols=mat[0].length;
        int largestCol=Integer.MIN_VALUE;
        int largestColIndex=-1;
        int largestRow=Integer.MIN_VALUE;
        int largestRowIndex=-1;
        int largest=Integer.MIN_VALUE;
        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<rows;i++){
            	sum=sum+mat[i][j];
	        }
	        if(sum>largestCol){
	            largestCol=sum;
	            largestColIndex=j;
	        }
	    }
        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<cols;j++){
            	sum=sum+mat[i][j];
	        }
	        if(sum>largestRow){
	            largestRow=sum;
	            largestRowIndex=i;
	        }
	    }
        if(largestCol>largestRow) {
        	largest=largestCol;
        	System.out.println("column "+largestColIndex+" "+largest);
        }else {
        	largest=largestRow;
        	System.out.println("row "+largestRowIndex+" "+largest);
        }
	}

	public static void main(String[] args) {
		int [][]input=takeInput();
	    print2darray(input);
	    findLargest(input);
	}

}
