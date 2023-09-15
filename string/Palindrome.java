package string;
import java.util.*;
public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		boolean result = false;
		if(str.length() == 0)
			result = false;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length()-1-i)) {
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean result = isPalindrome(str);
		System.out.println(result);
		s.close();
	}

}
