package stack;

import java.util.Stack;

public class StackReverse {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if(input.empty())
	    {
	        return;
	    }
	    int x = input.lastElement();
	    input.pop();
	    reverseStack(input,extra);
	    while(!input.empty())
	    {
	        extra.push(input.lastElement());
	        input.pop();
	    }
	    input.push(x);
	    while(!extra.empty())
	    {
	        input.push(extra.lastElement());
	        extra.pop();
	    }
	}
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
	    s1.push(1);
	    s1.push(2);
	    s1.push(3);
	    s1.push(4);
	    s1.push(5);
	    
	    reverseStack(s1, s2);
	    
	    for(int i = 0; i < s1.size(); i++) {
	        System.out.print(s1.peek() + " ");
	        s1.pop();
	    }
	}

}
