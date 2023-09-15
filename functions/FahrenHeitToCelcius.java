package functions;
import java.util.Scanner;

public class FahrenHeitToCelcius {
	
	public static void printFahrenheitTable(int start, int end, int step) {
		while(start<=end) {
			double c=(int)(((start-32)*5)/9);
			System.out.println(start+"\t"+(int)c);
			start=start+step;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		int w=sc.nextInt();
		printFahrenheitTable(s,e,w);
	}

}
