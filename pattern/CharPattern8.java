package pattern;
import java.util.Scanner;
public class CharPattern8 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int i=1;
		 while(i<=n) {
			int space=0;
			while(space<i-1) {
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			while(j<=n) {
				System.out.print('x');
				j=j+1;
			}
			System.out.println();
			i=i+1;
			}
	}

}
