package stack;
import java.util.Stack;
public class CodeSnippet {
	public static void main (String[] args) {
//        Stack<Integer> stack=new Stack<Integer>();
//        stack.push(5);
//        stack.push(10);
//        stack.push(15);
//        System.out.print(stack.pop()+stack.size());
		
//		Stack<Integer> stack=new Stack<Integer>();
//        for(int i=0;i<10;i++)
//        {
//            stack.push(i*2);
//        }
//        System.out.print(stack.peek());
		
		Stack<Integer> stack=new Stack<Integer>();
        while(stack.isEmpty())
        {
            stack.push(10);
        }
        System.out.print(stack.pop()+" "+stack.size());
    }
}
