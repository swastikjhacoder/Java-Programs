package test2;
import java.util.Scanner;
public class Probability {
	public static double factorial(double n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
	
    public static int probability(int n,int x){
        double N0,Ne1,Ne2;
        int P;
        N0=factorial(8.0)/(factorial(n*1.0)*factorial(8.0-n));
        Ne1=factorial(4.0)/(factorial(x*1.0)*factorial(4.0-x));
        Ne2=factorial(4.0)/(factorial(((n-x)*1.0))*factorial((4.0-(n-x))));
        P=(int)(((Ne1*Ne2)/N0)*100);
        return P;
    }
	public static void main(String[] args) { Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int x = s.nextInt();
	    int result = probability(n, x);
	    System.out.println(result);
	}

}
