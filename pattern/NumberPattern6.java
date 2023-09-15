package pattern;
import java.util.Scanner;
public class NumberPattern6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int count=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(count);
				j=j+1;
				count=count+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
