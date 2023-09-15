package operator;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long num=s.nextLong();
		int dec = 0, i = 0;
	    long rem;
	    while (num != 0) {
	      rem = num % 10;
	      num /= 10;
	      dec += rem * Math.pow(2, i);
	      ++i;
	    }
	    System.out.println(dec);
	}

}
