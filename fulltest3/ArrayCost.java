package fulltest3;
import java.util.*;
public class ArrayCost {
	static int INF = 10000;
	
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
	
	static void minCost(int arr[]) {
	    Arrays.sort(arr);
	    int m = 2 * arr.length;
	    int cost[][] = new int[arr.length + 1][m + 1];
	    for(int i = 0; i <= arr.length; i++) {
	        for(int j = 0; j <= m; j++) {
	            cost[i][j] = INF;
	        }
	    }
	    cost[0][0] = 0;
	    int prev = 0;
	    for(int i = 1; i <= arr.length; i++) {
	    	prev = cost[i - 1][0];
	        for(int j = 1; j <= m; j++) {
	            cost[i][j] = Math.min(cost[i][j], prev + Math.abs(j - arr[i - 1]));
	            prev = Math.min(prev, cost[i - 1][j]);
	        }
	    }
	    int minCost = INF;
	    for(int j = 1; j <= m; j++) {
	        minCost = Math.min(minCost, cost[arr.length][j]);
	    }
	    System.out.print(minCost);
	}
	
	public static void main(String[] args) {
		int arr[] = takeInput();
	    int n = arr.length;
	    minCost(arr);
	}

}
