package operator;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		double t=0;  
		double sqrtroot=n/2;  
		while((t-sqrtroot)!= 0) {  
		t=sqrtroot;  
		sqrtroot=(t+(n/t))/2;  
		}   
		  
		System.out.println((int)sqrtroot);
	}

}
