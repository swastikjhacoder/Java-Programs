package pattern;
import java.util.Scanner;
public class CharPattern7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int i=1;
         System.out.println('*');
	     while(i<=n){
             System.out.print('*');
	         int num=1;
	         while(num<=i){
	             //System.out.print('*');
	             System.out.print(num);
	             num=num+1;
	         }
	         int dec=i-1;
	         while(dec>=1){
	             System.out.print(dec);
	             //System.out.print('*');
	             dec=dec-1;
	         }
             System.out.print('*');
	         System.out.println();
	         i=i+1;
	     }
	     int j=n-1;
	     while(j>=1) {
             System.out.print('*');
	    	 int num=1;
	         while(num<=j){
	             System.out.print(num);
	             num=num+1;
	         }
	         int dec=j-1;
	         while(dec>=1){
	             System.out.print(dec);
	             dec=dec-1;
	         }
             System.out.print('*');
	    	 System.out.println();
	    	 j=j-1;
	     }
         System.out.println('*');
	}

}
