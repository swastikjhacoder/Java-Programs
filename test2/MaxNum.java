package test2;
import java.util.Scanner;
public class MaxNum {
	public static int max_number(int n){
		int n1=n;
		int count=4;
		int max=-1;
		int b=1;
		while(count-->0){
		n1=((n/(10*b)) *b) + n%b;
		max=Math.max(n1,max);
		n1=n;
		b*=10;
		}
		return max;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(max_number(n));
	}

}
