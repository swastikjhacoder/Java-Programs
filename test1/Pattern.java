package test1;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=n;
			while(j>=1) {
				if(j==i) {
					System.out.print('*');
				}else {
					System.out.print(j);
				}
				j=j-1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
