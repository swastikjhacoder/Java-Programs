package fundamentals;
import java.util.Scanner;
public class CharacterCase {

	public static void main(String[] args) {
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			System.out.println(1);
		}else if(ch>='a' && ch<='z') {
			System.out.println(0);
		}else {
			System.out.println(-1);
		}
		
//		char ch;
//		int m1,m2,m3,avg;
//		Scanner s=new Scanner(System.in);
//		ch=s.next().charAt(0);
//		m1=s.nextInt();
//		m2=s.nextInt();
//		m3=s.nextInt();
//		avg=(m1+m2+m3)/3;
//		System.out.print(ch+"\n");
//		System.out.println(avg);
			
	}

}
