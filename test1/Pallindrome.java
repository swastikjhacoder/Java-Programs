package test1;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int orig=num;
		int rev= 0;
	    while(num != 0) {
	      int digit = num % 10;
	      rev = rev * 10 + digit;
	      num /= 10;
	    }
	    if(orig==rev) {
	    	System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }
	}

}
