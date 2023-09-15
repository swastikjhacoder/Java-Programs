package string;
import java.util.*;
public class RemoveAllOccurance {
	private static Scanner sc;
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String ans = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=ch){
				ans+=str.charAt(i);
			}            
		}
	    return ans;
	}

	public static void main(String[] args) {
		sc= new Scanner(System.in);
		System.out.print("\nPlease Enter String to Delete All Characters =  ");
		String delLastCharStr = sc.nextLine();
		System.out.print("\nEnter the Character to Delete =  ");
		char del_lch = sc.next().charAt(0);
		String str = removeAllOccurrencesOfChar(delLastCharStr,del_lch);
		System.out.println(str);
	}

}
