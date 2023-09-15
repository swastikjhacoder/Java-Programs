package recursionAssignment;

import java.util.Scanner;

public class pairStar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
		s.close();
	}

	public static String addStars(String s) {
		if(s.length() == 1) {
			return s;
		}
		String smallString = addStars(s.substring(1));
		if(s.charAt(0) == s.charAt(1)) {
			return s.charAt(0) + "*" + smallString;
		}else {
			return s.charAt(0) + smallString;
		}
	}
}
