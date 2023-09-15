package recursion2;
import java.util.Scanner;
public class removeX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String result = remove_X_fromString(str);
		System.out.println(result);
		s.close();
	}

	public static String remove_X_fromString(String input) {
		if(input.length() == 0) {
			return input;
		}
		String output = remove_X_fromString(input.substring(1));
		if(input.charAt(0) == 'x' || input.charAt(0) == 'X') {
			return output;
		}else {
			return input.charAt(0) + output;
		}
	}
}
