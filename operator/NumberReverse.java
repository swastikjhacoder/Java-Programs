package operator;
import java.util.Scanner;
public class NumberReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		while(n!=0) {
			int digit = n % 10;
		      rev = rev * 10 + digit;
		      n /= 10;
		}
		rev=(int)rev;
		System.out.println(rev);
	}

}
