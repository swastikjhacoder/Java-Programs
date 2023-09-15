package string;

import java.util.Scanner;

public class RemoveDuplicateChars {
	
	public static String removeConsecutiveDuplicates(String str) {
		if (str.length() == 0) {
			return str;
		}
		String result = "";
		char ch = str.charAt(0);
		result += ch;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				;
			else
				result += str.charAt(i);
			ch = str.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String ans = removeConsecutiveDuplicates(str);
		System.out.println(ans);
	}

}
