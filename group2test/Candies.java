package group2test;
import java.util.Scanner;
import java.util.Arrays;
public class Candies {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
        int t = s.nextInt();
//        StringBuffer sb = new StringBuffer();    
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int cost[] = new int[n];
            for(int i = 0; i < n; i++) {
                cost[i] = s.nextInt();
            }
            long a = minimumCost(cost, n, k);
            long b = maximumCost(cost, n, k);
            System.out.print(a + " " + b + "\n");
        }
        s.close();
	}
	
	public static long minimumCost(int[] cost, int n, int k)  {
		Arrays.sort(cost);
		int res = 0;
        for (int i = 0; i < n; i++) {
            res += cost[i];
            n = n - k;
        }
        return res;
    }
    
    public static long maximumCost(int[] cost, int n, int k) {
		Arrays.sort(cost);
    	int res = 0, index = 0;
    	 
        for (int i = n - 1; i >= index; i--) {
            res += cost[i];
            index += k;
        }
        return res;
    }
}
