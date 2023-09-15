package pattern;
import java.util.Scanner;
public class NumberPattern15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int sum=0;
			while(j<=i) {
				System.out.print(j);
				if(j==i) {
					System.out.print("=");
				}else {
					System.out.print("+");	
				}
				sum=sum+j;
				j=j+1;
			}
			
			System.out.print(sum);
			System.out.println();
			i=i+1;
		}
	}

}
