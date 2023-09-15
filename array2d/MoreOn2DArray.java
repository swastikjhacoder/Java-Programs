package array2d;

public class MoreOn2DArray {

	public static void main(String[] args) {
		int[][] arr=new int[3][5];
//	    System.out.pritnln(arr[0][0]);
//	    int[][] arr=new int[4][];
//	    System.out.pritnln(arr);
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    }
//	    System.out.pritnln(arr[0][0]);
	    for(int i=0;i<arr.length;i++){
	       arr[i]=new int[5];
	    }
	    for(int i=0;i<arr.length;i++){
	       arr[i]=new int[i+2];
	    }
	    for(int i=0;i<arr.length;i++){
	       for(int j=0;j<arr[i].length;j++){
	        System.out.println(arr[i][j]+" ");
	       }
	    }
	}

}
