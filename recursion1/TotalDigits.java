package recursion;
import java.util.Scanner;
public class TotalDigits {
	  static int c = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(count(n));
		s.close();
	}
	
	public static int count(int n){
		if (n > 0) {
		      c++;
		      count(n / 10);
		    }
		return c;
	}
}
