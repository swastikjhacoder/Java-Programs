package functions;
import java.util.Scanner;
public class Fibonacci {

	public static boolean checkMember(int n){
		int a=0,b=1,temp=0;
		boolean result=false;
		for(int i=0; i<=n; i++) {
			temp=a+b;
			a=b;
			b=temp;
			if(temp==n) {
				result=true;
				return true;
			}else {
				result=false;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean ans=checkMember(n);
		System.out.println(ans);
	}

}
