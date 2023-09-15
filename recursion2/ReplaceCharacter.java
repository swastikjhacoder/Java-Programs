package recursion2;
import java.util.Scanner;
public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String result = replaceChar(str,'x','y');
		System.out.println(result);
		s.close();
	}
	
	public static String replaceChar(String str, char a, char b) {
		if(str.length() == 0) {
			return str;
		}
		String smallOutput = replaceChar(str.substring(1), a, b);
		if(str.charAt(0) == a) {
			return b + smallOutput;
		}else {
			return str.charAt(0) + smallOutput;
		}
	}
}
