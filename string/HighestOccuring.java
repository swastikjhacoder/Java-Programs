package string;
import java.util.*;
public class HighestOccuring {

	public static char highestOccuringChar(String str) {
		char ans = '\0';
		if(str.length()==0)
			return ans;
	    int maxfreq = 0, n = str.length();
	    int count[] = new int[256];
	    for (int i = 0; i < n; i++) {
	       count[str.charAt(i)]++;
	       if (count[str.charAt(i)] > maxfreq) {
	          maxfreq = count[str.charAt(i)];
	       }
	    }
		for(int i = 0;i<256;i++){
			if(count[i] == maxfreq){
				return (char) i;
			}
		}
	    return ' ';
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = highestOccuringChar(str);
		System.out.println(ch);
	}

}
