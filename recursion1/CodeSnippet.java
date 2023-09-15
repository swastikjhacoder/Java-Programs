package recursion;
//import java.util.Scanner;
public class CodeSnippet {

	public static void main(String[] args) {
//		 int num = 5;
//		    int ans = func(num - 1);
//		    System.out.println(ans);
		
//		int num = 5;
//	    print(num);
		
		int num = 3;
	    print(num);
	}
	
//	public static int func(int num){
//	    return func(num- 1);
//	}
	
	public static void print(int n){
//	    if(n < 0){
//	        return;
//	    }
//	    System.out.print(n+" ");
//	    print(n - 2);
//	    }

		if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}
}
