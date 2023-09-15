package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ByteLandian {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
//		long halfValue = (n / 2);
//        long thirdValue = (n / 3);
//        long fourthValue = (n / 4);
//        long totalIntermediate = halfValue + thirdValue + fourthValue;
//        if(n > totalIntermediate) {
//            memo.put(n, n);
//            return n;
//        }else {
//            long maxHalfPortion = bytelandian(halfValue, memo);
//            long maxThirdPortion = bytelandian(thirdValue, memo);
//            long maxFourthPortion = bytelandian(fourthValue, memo);
//
//            long result = maxHalfPortion+maxThirdPortion+maxFourthPortion;
//            memo.put(n, result);
//            return result;
//        }
		
		if(n ==0|| n==1) 
			return n;
        if(memo.containsKey(n)) return memo.get(n);
        long max = Math.max(n, bytelandian(n/2,memo) + bytelandian(n/3,memo) + bytelandian(n/4,memo));
        if(n<10000) 
        	memo.put(n,max);
        return max;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		long n = Long.parseLong(br.readLine().trim());
        HashMap<Long, Long> memo = new HashMap<Long, Long>();
        System.out.println(bytelandian(n,memo));
	}

}
