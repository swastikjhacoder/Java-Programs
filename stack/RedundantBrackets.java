package stack;

import java.util.Scanner;
import java.util.Stack;
public class RedundantBrackets {

	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> s = new Stack<Character>();
		char[] charArray = expression.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
	        char c = charArray[i];
	        if (c == '(' || c == '+' || c == '*' || c == '-' || c == '/')
	            s.push(c);
	        else if (c == ')')
	        {
	            if (s.lastElement() == '(')
	                return true;
	            else
	            {
	                while (!s.empty() && s.lastElement() != '(')
	                    s.pop();
	                s.pop();
	            }
	        }
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		String inputStr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string to check:");
		inputStr = sc.nextLine();
		if (checkRedundantBrackets(inputStr))
			System.out.println("Input string "+inputStr+" is balanced.");
		else
			System.out.println("Input string "+inputStr+" is not balanced.");
		sc.close();
	}

}
