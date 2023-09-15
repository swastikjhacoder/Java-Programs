package operator;
import java.util.Scanner;
public class TermsAP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int term;
		for(int i=1;i<=n;i++) {
			term=3*i+2;
			if(term%4!=0) {
				System.out.print(term+" ");
			}else {
				++n;
			}
		}
	}

}
