package fundamentals;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String args[]) {
     
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int div=2;
      boolean isPrime=true;
      
      while(div<=n-1){
          if(n%div==0){
         // System.out.println(div+" "+"Composite");
          isPrime=false;
          
      }
      div=div+1;
      }
      if(isPrime==true){
          System.out.println("Prime");
      }else{
          System.out.println("Composite");
      }
      
    	
//    	Scanner s=new Scanner (System.in);
//        int n=s.nextInt();
//        boolean isprime=true;
//        if(n%2==0)
//            isprime=false;
//        int i=3;
//        while(isprime&&i<n)
//        {
//            isprime=!(n%i==0);
//            i+=2;
//        }
//        if(isprime)
//        {
//            System.out.println("Prime");
//        }
//        else
//        {
//            System.out.println("Composite");
//        }

    }
}