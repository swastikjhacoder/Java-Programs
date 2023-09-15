package string;
import java.util.*;
public class CountAllWords {
	
	public static int countWords(String str) {	
		int count=1;
		if(str.length()==0)
			count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count = countWords(str);
		System.out.println(count);
	}

}
