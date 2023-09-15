package recursionAssignment;

import java.util.Scanner;

public class checkAandB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
//		System.out.println(input.charAt(input.length() - 1));
		s.close();
	}

	public static boolean checkAB(String input) {
		if(input.length() == 0) {
            return true;
        }
        if(input.charAt(0) == 'a') {
        	if(input.charAt(input.length() -1) == 'b' && input.charAt(input.length() - 2) == 'b' && input.charAt(input.length() - 3) == 'a'){
        		checkAB(input.substring(2));
                return true;
            }else if(input.charAt(input.length() -1) == 'a' && input.charAt(input.length() - 2) == 'a' || input.charAt(input.length() - 2) == 'b' && input.charAt(input.length() - 3) == 'b') {
            	checkAB(input.substring(1));
                return true;
            }else{
                checkAB(input.substring(1));
                return false;
            }
        }else {
        	return false;
        }
	}
}
