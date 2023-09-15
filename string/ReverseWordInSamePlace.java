package string;
import java.util.*;
public class ReverseWordInSamePlace {
	
	public static String reverseEachWord(String str) {
		String rev = "",result = "";
		int start = 0,j,end;
		for(int i= 0;i < str.length();i++) {
			if(str.charAt(i) == ' ') {
				end = i - 1;
				rev = "";
				for(j = end;j >= start;j--) {
					rev += str.charAt(j);
				}
				start  = i + 1;
				result = result + rev + " ";
			}
		}
		rev = "";
		for(j = str.length() - 1;j >= start;j--) {
			rev += str.charAt(j);
		}
		result = result + rev + " ";		
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = reverseEachWord(str);
		System.out.print(str1);
	}

}
