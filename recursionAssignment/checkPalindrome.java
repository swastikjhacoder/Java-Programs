package recursionAssignment;
import java.util.Scanner;
public class checkPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
		s.close();
	}

	public static boolean isStringPalindrome(String input) {
		int n = input.length();
		if (n == 0)
			return true;
		return checkString(input, 0, n - 1);
	}
	
	static boolean checkString(String str, int s, int e) { 
        if (s == e){ 
            return true;
        } 
        if ((str.charAt(s)) != (str.charAt(e))) { 
            return false;
        } 
        if (s < e + 1) 
            return checkString(str, s + 1, e - 1);   
        return true; 
    }   
}
