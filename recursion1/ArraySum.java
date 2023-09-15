package recursion;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(sum(arr));
		s.close();
	}
	
	public static int sum(int input[]) {
		return func(input,0);
	}
	
	public static int func(int input[], int n) {
		if (n == input.length-1) {
            return input[n];
          }
		return input[n] + func(input, n+1);
	}
}
