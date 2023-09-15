package group1test;
import java.util.Scanner;
public class Substring1s {
	
	static int countOfSubstringWithOnlyOnes(String s) {
	    int res = 0, count = 0;
	    for(int i = 0; i < s.length(); i++) {
	        count = s.charAt(i) == '1' ? count + 1 : 0;
	        res = (res + count);
	    }
	    return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
	    System.out.println(countOfSubstringWithOnlyOnes(str));
	    s.close();
	}

}
