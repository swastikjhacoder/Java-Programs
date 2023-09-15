package dp2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinNumChocolates {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];
        if (size == 0) {
            return input;
        }
		String[] strNums;
		strNums = br.readLine().split("\\s");
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }
        return input;
    }
	
	public static int getMin(int arr[], int N){
		int[] dp = new int[N+1];
		int x = 0;
	    dp[0] = 1;
	    for(int i = 1; i < N; i++) {
	        if(arr[i] > arr[i-1]) {
	            dp[i] = dp[i] + dp[i-1] + 1;
	        }else {
	            dp[i] = 1;
	        }
	    }
	    for(int i= N - 2; i >= 0; i--) {
	        if(arr[i] > arr[i+1] && dp[i] <= dp[i+1]) {
	            dp[i] = dp[i+1] + 1;
	        }
	    }
	    for(int i = 0; i < N; i++) {
	        x += dp[i];
	    }   
	    return x;
	}

	public static void main(String[] args) throws IOException {
		int[] arr = takeInput();
        System.out.print(getMin(arr,arr.length));
	}

}
