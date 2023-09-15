package fundamentals;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		int num,i=2;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(i<=num/2) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
			i=i+1;
		}
	}

}
