package recursion2;
import java.util.Scanner;
public class removeDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(removeConsecutiveDuplicates(str));
		s.close();
	}
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length() <= 1) {
			return s;
		}
		if(s.charAt(0) == s.charAt(1)) {
			String smallOutput = removeConsecutiveDuplicates(s.substring(1));
			return smallOutput;
		}else {
			String smallOutput = removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}
}
