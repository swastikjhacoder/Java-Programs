package recursion;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int output = fib(n);
		System.out.println(output);
		s.close();
	}
	
	public static int fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		int fib_n_1 = fib(n-1);
		int fib_n_2 = fib(n-2);
		int result = fib_n_1 + fib_n_2;
		return result;
	}
}
