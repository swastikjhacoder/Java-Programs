package recursion;
import java.util.Scanner;
public class Power {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int x = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(pow(x, n));
		s.close();
	}

	public static int pow(int x, int n) {
		if(n!=0){
			return(x*pow(x,n-1));
		}else {
			 return 1;
		}
	}
}
