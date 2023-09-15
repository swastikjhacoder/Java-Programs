package test7;
import java.util.*;

public class BobString {
	
//	static void maximumChars(String str) {
//        int n = str.length();
//        int res = -1;
//        for (int i = 0; i < n - 1; i++)
//            for (int j = i + 1; j < n; j++)
//                if (str.charAt(i) == str.charAt(j))
//                    res = Math.max(res, Math.abs(j - i - 1));
//        System.out.println(res);
//    }
	static int MAX_CHAR = 256;
	
	static void maximumChars(String str) {
        int n = str.length();
        int res = -1;
        int []firstInd = new int[MAX_CHAR]; 
        for (int i = 0; i < MAX_CHAR; i++)
            firstInd[i] = -1;
        for (int i = 0; i < n; i++) {
            int first_ind = firstInd[str.charAt(i)];
            if (first_ind == -1)
                firstInd[str.charAt(i)] = i;
            else
                res = Math.max(res, Math.abs(i - first_ind - 1));
        }
        System.out.println(res);
    }

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i = 0; i < t; i++) {
			words.add(s.next());
		}
		for(int i = 0; i < t; i++) {
			maximumChars(words.get(i));
		}
		s.close();
	}

}
