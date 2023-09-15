package test4;
import java.util.Scanner;
public class SplitArrays {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
		s.close();
	}

	public static boolean splitArray(int input[]) {
		return helper(input, input.length, 0, 0, 0);
	}
	
	static boolean helper(int arr[], int n, int start, int lsum, int rsum) {
		if (start == n)
			return lsum == rsum;
		if (arr[start] % 5 == 0)
			lsum += arr[start];
		else if (arr[start] % 3 == 0)
			rsum += arr[start];
		else
			return helper(arr, n, start + 1, lsum + arr[start], rsum) || helper(arr, n, start + 1, lsum, rsum + arr[start]);
		return helper(arr, n, start + 1, lsum, rsum);
	}
}
