package test1;
import java.util.Scanner;
public class ArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int prev=s.nextInt();
        int progVal=0,gap=0;
        int i=2;
        while(i<=n){
        	int curr=s.nextInt();
        	progVal=curr-prev;
        	if(gap==0) {
        		gap=progVal;
        	}
        	if(gap!=progVal) {
        		System.out.println("false");
        		return;
        	}
        	prev=curr;
        	i++;
        }
        System.out.println("true");
	}

}
