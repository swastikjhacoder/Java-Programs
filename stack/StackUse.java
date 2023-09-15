package stack;
import java.util.Scanner;
public class StackUse {

	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) throws StackEmptyException, StackFullException {
//		StackUsingArray stack = new StackUsingArray();
//		StackUsingLL<Integer> stack = new StackUsingLL<>();
//        int arr[]={5,6,7,1,9};
//        for(int i=0;i<arr.length; i++){
//            stack.push(arr[i]);
//        }
//        while(!stack.isEmpty()){
//          System.out.println(stack.pop());
//        }

        //stack.push(10);
        //System.out.println(stack.top());
        //stack.pop();
        //stack.size();
        //System.out.println(stack.isEmpty());
        //stack.isEmpty();
	
			Stack stack = new Stack();

			int q = s.nextInt();

			while (q > 0) {
				int choice, input;
				choice = s.nextInt();

				switch(choice) {
					case 1:
						input = s.nextInt();
						stack.push(input);
						break;

					case 2:
						System.out.println(stack.pop());
						break;

					case 3:
						System.out.println(stack.top());
						break;

					case 4:
						System.out.println(stack.getSize());
						break; 

					default: 
						System.out.println((stack.isEmpty()) ? "true" : "false");
				}

				q -= 1;
			}

		}
	}
