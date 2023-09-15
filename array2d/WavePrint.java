package array2d;
import java.util.*;
public class WavePrint {

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
	
	public static void wavePrint(int mat[][]){
		if (mat.length == 0){
	          System.out.println(0);
				return;
			}
		int i,j=0;
	    while(j<mat[0].length){
	        if(j%2==0){
	            for(i=0;i<mat.length;i++){
	            	System.out.print(mat[i][j]+" ");
	                if(i==(mat.length-1)){
	                    break;
	                }
	            }
	            j++;
	        }else{
	            for(i=(mat.length-1);i>=0;i--){
	            	System.out.print(mat[i][j]+" ");
	                if(i==0){
	                    break;
	                }
	            }
	            j++;
	        }
	    }
	}

	public static void main(String[] args) {
		int [][]input=takeInput();
	    print2darray(input);
	    wavePrint(input);
	}

}
