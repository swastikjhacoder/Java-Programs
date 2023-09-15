package recursionAssignment;

import java.util.Scanner;

public class countZero {
	
	static int c = 0;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
		s.close();
	}

	public static int countZerosRec(int input) {
		if(input == 0) {
			return 1;
		}
		if (input > 0) {
			int temp = input % 10;
			if(temp == 0) {
				c++;
			}
			countZerosRec(input / 10);
		}
		return c;
	}
}
