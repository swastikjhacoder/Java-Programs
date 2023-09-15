package fundamentals;
import java.util.Scanner;
public class Temparature {

	public static void main(String[] args) {
		int s,e,w,c;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		e=sc.nextInt();
		w=sc.nextInt();
		while(s<=e) {
			c=(int)(((s-32)*5)/9);
			System.out.println(s+" "+c);
			s=s+w;
		}
	}
}
