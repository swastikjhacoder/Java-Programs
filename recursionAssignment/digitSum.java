package recursionAssignment;
import java.util.Scanner;
public class digitSum {
	static int sum = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
		s.close();
	}

	public static int sumOfDigits(int input){
		if (input > 0) {
			int temp = input % 10;
			sum += temp;
			sumOfDigits(input / 10);
		}
		return sum;
	}
}
