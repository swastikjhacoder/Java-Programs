package string;
import java.util.*;
public class CompressWord {
	
	public static String getCompressedString(String str) {
//		String ans = "";
//		if(str.length()==0)
//			return ans;
////	    int maxfreq = 0, n = str.length();
////	    int count[] = new int[256];
////	    for (int i = 0; i < n; i++) {
////	    	count[str.charAt(i)]++;
////	       	maxfreq = count[str.charAt(i)];
////	  	    ans=(str.charAt(i)+String.valueOf(maxfreq));
////	    }
//		
//		char[] ch = new char[str.length()];
//		for(int i = 0; i < str.length(); i++) {
//			ch[i] = str.charAt(i);
//		}
//		int count = 0;
//		for(int i = 0; i < str.length(); i++) {
//			for(int j=i+1; j<str.length(); j++) {
//				if(ch[i] == ch[j]) {
//					++count;
//					ans = ch[i]+String.valueOf(count);
//				}
//			}
//		}
//		
//	    return ans;
		
		int i,count = 1;
		   String result = "";
		   for(i = 0;i < str.length() - 1;i++) {
			   if(str.charAt(i+1) == str.charAt(i)) {
				   count++;	   
			   }
			   else {
				   if(count != 1)
					   result = result + str.charAt(i) + count;
				   else
					   result = result + str.charAt(i);
				   count = 1;
			   }
		   }
		   if(count != 1)
		   result = result + str.charAt(i) + count;
		   else
		   result = result + str.charAt(i);   
		   return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String res = getCompressedString(str);
		System.out.println(res);
	}

}
