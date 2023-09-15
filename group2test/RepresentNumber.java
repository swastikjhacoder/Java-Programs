package group2test;

import java.util.Scanner;

public class RepresentNumber {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int number = s.nextInt();
		printCombination(number);
	}
	
	static void printArray(int p[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(p[i]+" ");
        System.out.println();
    }
	
	static int[] dp = new int[200];
    static int count = 0;
	
	static void print(int idx) {
        for (int i = 1; i < idx; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println("");
    }
	
	static void printPartitions(int target, int maxValue, String suffix) {
	    if (target == 0)
	        System.out.println(suffix);
	    else {
	        if (maxValue > 1)
	            printPartitions(target, maxValue-1, suffix);
	        if (maxValue <= target)
	            printPartitions(target-maxValue, maxValue, maxValue + " " + suffix);
	    }
	}
	
	static void solve(int remSum, int maxVal, int idx, int count) {
		if (remSum == 0) {
			print(idx);
			count++;
			return;
		}
		for (int i = maxVal; i >= 1; i--) {
			if (i > remSum) {
				continue;
			}
			else if (i <= remSum) {
				dp[idx] = i;
				solve(remSum - i, i, idx + 1, count);
			}
		}
	}

    static void printCombination(int num)
    {
//    	count = 0;
//    	solve(num, num, 1, count);
    	
    	printPartitions(num, num, "");
    	
    	
//        int[] p = new int[num]; 
//        int k = 0;
//        p[k] = num;
//        while (true) {
//            printArray(p, k+1);
//            int rem_val = 0;
//            while (k >= 0 && p[k] == 1) {
//                rem_val += p[k];
//                k--;
//            }
//            if (k < 0)  return;
//            p[k]--;
//            rem_val++;
//            while (rem_val > p[k]) {
//                p[k+1] = p[k];
//                rem_val = rem_val - p[k];
//                k++;
//            }
//            p[k+1] = rem_val;
//            k++;
//        }
    }
}
