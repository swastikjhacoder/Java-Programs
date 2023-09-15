package operator;
import java.util.Scanner;
public class SumProduct {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		int sum=0,pro=1;
		switch(c) {
		case 1:
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			System.out.println(sum);
			break;
		case 2:
			for(int i=1;i<=n;i++) {
				pro*=i;
			}
			System.out.println(pro);
			break;
		default:
			System.out.println(-1);
		}
		s.close();
	}

}
