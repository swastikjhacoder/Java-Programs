package recursion;
import java.util.Scanner;
public class Print1stNaturalNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print1stNatural(n);
		s.close();
	}

	public static void print1stNatural(int n) {
		if(n == 0) {
			return;
		}
		print1stNatural(n-1);
		System.out.print(n + " ");
	}
}
