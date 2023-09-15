package stack;
import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets {
	
	public static boolean isBalanced(String expression) throws StackEmptyException {
		Stack<Character> stack = new Stack<Character>(); 
        char[] charArray = expression.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
        	char current = charArray[i];
        	if (current == '{' || current == '[' || current == '(') {
        		stack.push(current);
        		continue;   
        	}
        	if (stack.isEmpty()) {
        		return false;
        	}
        	char popChar;
        	switch (current) {
        	case ')':
        		popChar = (char) stack.pop();
        		if (popChar == '{' || popChar == '[')
        			return false;
        		break;
        	case '}':
        		popChar = (char) stack.pop();
        		if (popChar == '(' || popChar == '[')
        			return false;
        		break;
        	case ']':
        		popChar = (char) stack.pop();
        		if (popChar == '(' || popChar == '{')
        			return false;
        		break;
        	}
        }
        return (stack.isEmpty());
	}

	public static void main(String[] args) throws StackEmptyException {
		String inputStr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string to check:");
		inputStr = sc.nextLine();
		if (isBalanced(inputStr))
			System.out.println("Input string "+inputStr+" is balanced.");
		else
			System.out.println("Input string "+inputStr+" is not balanced.");
		sc.close();
	}
}
