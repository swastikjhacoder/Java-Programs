package string;
import java.util.*;
public class ReverseString {
	
    public static String reverseString(String str){
        String reversedString="";
        //for(int i=str.length()-1;i>=0;i--){
          // reversedString+=str.charAt(i);
      //  }
      for(int i=0;i<str.length();i++){
          reversedString = str.charAt(i) + reversedString;
      }
      return reversedString;
      }

	public static void main(String[] args) {
		String str="abcde";
	      String reversedString=reverseString(str);
	      System.out.println(reversedString);
	}

}
