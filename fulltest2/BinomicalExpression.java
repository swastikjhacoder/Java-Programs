package fulltest2;
import java.util.*;
public class BinomicalExpression {
	
	static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++)
            f *= i;             
        return f;
    }

    static void series(int A, int X, int n) {
        int nFact = factorial(n);
        for (int i = 0; i < n + 1; i++) {
            int niFact = factorial(n - i);
            int iFact = factorial(i);
            int aPow = (int)Math.pow(A, n - i);
            int xPow = (int)Math.pow(X, i);
            System.out.print((nFact * aPow * xPow) / (niFact * iFact) + " ");
        }
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int X = s.nextInt();
		int n = s.nextInt();
		series(A, X, n);
		s.close();
	}

}
