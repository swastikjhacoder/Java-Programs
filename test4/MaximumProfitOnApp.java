package test4;
import java.util.*;
public class MaximumProfitOnApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfit(input));
		s.close();
	}

	public static int maximumProfit(int budget[]) {
		Arrays.sort(budget);
        int result=Integer.MIN_VALUE;
        int n=budget.length;
    	for(int i=0;i<n;i++)
    	{
    		result=Math.max(result,budget[i]*(n-i));
    	}
    	return result;
	}
}
