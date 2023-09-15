package recursionAssignment;

import java.util.Scanner;

public class staircaseSteps {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(staircase(n));
		s.close();
	}

	public static int staircase(int n){
		if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;
        else
            return staircase(n - 3) + staircase(n - 2) + staircase(n - 1);
	}
}
