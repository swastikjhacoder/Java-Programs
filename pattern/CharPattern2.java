package pattern;
import java.util.Scanner;
public class CharPattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				char p=(char)('A'+i-1);
				System.out.print(p);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
