package coursetest;
import java.util.Scanner;
public class Pattern {
	
	public static void print(int n) {
		int length = 2 * n - 1; 
        int first = 0;
        int second = length - 1;
        int pat[][] = new int[length][length];
        while (n != 0) {
            for (int i = first; i <= second; i++) {
                for (int j = first; j <= second; j++) {
                    if (i == first || i == second || j == first || j == second)
                    	pat[i][j] = n;
                }
            }
            ++first;
            --second;
            --n;
        }
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(pat[i][j]);
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		print(n);
        s.close();
	}

}
