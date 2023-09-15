package fundamentals;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		int x,n,pow=1,i=1;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		n=s.nextInt();
		while(i<=n) {
			pow=pow*x;
			i=i+1;
		}
		System.out.println(pow);
	}

}
