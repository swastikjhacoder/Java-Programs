package pattern;
import java.util.Scanner;
public class NumberPattern11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		while(i>=1) {
			int j=1;
			while(j<=i) {
				System.out.print(i);
				j=j+1;
			}
			System.out.println();
			i=i-1;
		}
	}

}
