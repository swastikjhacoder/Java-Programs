package pattern;
import java.util.Scanner;
public class NumberPattern16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int k=1;
			int j=2*i-1;
			while(k<=n) {
				if(j>(2*n)-1) {
					j=1;
				}
				System.out.print(j);
				j=j+2;
				k=k+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
