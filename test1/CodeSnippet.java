package test1;

public class CodeSnippet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int p = 100;
//		if(p > 20) {
//		    if(p < 20) {
//		        System.out.print("coding");
//		    }
//		} else {
//		    System.out.print("ninjas");
//		}
		
//		 int x , y = 1;
//         x = 10;
//         if (x != 10 && x / 0 == 0)
//             System.out.println(y);
//         else
//             System.out.println(++y);
		
//		int a = 10, b = 20, c = 100;
//
//        if(a <= b && b != 20) {
//            System.out.println("hello");
//        }
//        else if(c >= a && c >= b) {
//            System.out.println("hi");
//        }
//        else {
//            System.out.println("hey");
//        }
		
//		 int a = 10, b = 20, c = 100;
//
//		    if(a <= b || c <= b) {
//		        System.out.println("hello");
//		    }
//		    else if(a <= b || a <= c) {
//		        System.out.println("hi");
//		    }
//		    else {
//		        System.out.println("hey");
//		    }
		
//		int a = 6;
//		int b = 12;
//		while (a < b) {
//		    System.out.print("In the loop");
//		    a += 2;
//		    b -= 2;
//		}
		
//		int x = 10;
//		while(x >= 0) {
//		    x = x - 1;
//		    System.out.print(x);
//		    x--;
//		}
		
		int num = 1234, reversed = 0;
	    System.out.println("Original Number: " + num);
	    while(num != 0) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }
	    System.out.println("Reversed Number: " + reversed);
	}

}
