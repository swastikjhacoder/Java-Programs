package fundamentals;
import java.util.Scanner;
public class MultiplicationN {

	public static void main(String[] args) {
		int i=1,n,res;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=10) {
			res=n*i;
			System.out.println(res);
			i=i+1;
		}
	}

}
