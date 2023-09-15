package operator;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0, b = 1, temp = 0;
		for(int i = 0; i < n; i++) {
			temp = a + b;
			a = b;
			b = temp;
		}
		System.out.println(a);
		s.close();
	}
}