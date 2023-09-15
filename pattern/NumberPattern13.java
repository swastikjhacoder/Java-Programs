package pattern;
import java.util.Scanner;
public class NumberPattern13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int i=1;
	     while(i<=n){
	         int spaces=1;
	         
	         while(spaces<=n-i){
	             
	             System.out.print(" ");
	             spaces=spaces+1;
	         }
	         int j=1;
			 while(j<=i) {
				 System.out.print(i+j-1);
				 j=j+1;
			 }
	         int dec=i+j-3;
	         while(dec>=i){
	             System.out.print(dec);
	             dec=dec-1;
	         }
	         System.out.println();
	         i=i+1;
	     }
	}

}
