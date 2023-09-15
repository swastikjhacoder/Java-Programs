package group2test;
import java.util.Scanner;
public class AModB {
	
	static int factorial(int n) {
        if (n == 0)
            return 1;
        return (n * factorial(n - 1));
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int tc = 1; tc <= t; tc++) {
			int A = s.nextInt();
			int B = s.nextInt();
			int res = factorial(A) % B;
			System.out.println(res);
		}
		s.close();
	}

}
