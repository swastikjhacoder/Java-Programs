package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWaysToMakeChange {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int countWaysToMakeChange(int denominations[], int value){
		int[][] storage = new int[value + 1][denominations.length + 1];
        int n = value;
        int k = denominations.length;
        return countWaysToMakeChange(denominations, n,k, storage);
	}
	
	private static int countWaysToMakeChange(int[] denominations, int n, int k, int[][] storage) {
        if (n == 0)
            return 1;
        if (n < 1 || k == 0)
            return 0;
        if (storage[n][k] > 0)
            return storage[n][k];
        int op1 = countWaysToMakeChange(denominations, n - denominations[k-1], k, storage);
        int op2 = countWaysToMakeChange(denominations, n, k - 1, storage);
        storage[n][k] = op1 + op2;
        return storage[n][k];
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		int numDenominations = Integer.parseInt(br.readLine().trim());
		int denominations[] = new int[numDenominations];
		String[] strNums;
		strNums = br.readLine().split("\\s");
        for (int i = 0; i < numDenominations; ++i) {
            denominations[i] = Integer.parseInt(strNums[i]);
        }
		int value = Integer.parseInt(br.readLine().trim());
		System.out.println(countWaysToMakeChange(denominations, value));
	}

}
