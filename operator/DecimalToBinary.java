package operator;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long num=s.nextLong();
		long binary = 0;
	    long remainder, i = 1;
	    while (num!=0) {
	      remainder = num % 2;
	        num /= 2;
	        binary += remainder * i;
	        i *= 10;
	    }
	    System.out.println(binary);
	}

}
