package fundamentals;
import java.util.Scanner;
public class SumEvenOdd {

	public static void main(String[] args) {
		int num,dig,esum=0,osum=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num!=0) {
			dig=num%10;
			if(dig%2==0) {
				esum=esum+dig;
			}else {
				osum=osum+dig;
			}
			num=num/10;
		}
		System.out.println(esum+" "+osum);
	}
}
