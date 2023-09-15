package fundamentals;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a;
//		Scanner s=new Scanner(System.in);
//		a=s.nextInt();
//		if(a%2==0) {
//			System.out.println("Even number");
//		}else {
//			System.out.println("Odd number");
//		}
		
		int a=50,b=20;
	    if(a>b)
	    {
	        if(a>100)
	        	System.out.println ("Ace");
	        if(b<100)
	            b=50;
	    }
	    else if(a==b)
	    {
	    	System.out.println ("King");
	    }
	    else 
	    {
	    	System.out.println ("Queen");
	    }

	}

}
