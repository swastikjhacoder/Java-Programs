package string;
import java.util.*;
public class AllSubstrings {

	public static void printSubstrings(String str) {
		if(str.length()==0)
			return;
		int len = str.length();  
        int temp = 0; 
        String arr[] = new String[len*(len+1)/2]; 
        for(int i = 0; i < len; i++) {  
        	for(int j = i; j < len; j++) {  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        } 
        for(int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);
        }
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		printSubstrings(str);
		s.close();
	}

}
