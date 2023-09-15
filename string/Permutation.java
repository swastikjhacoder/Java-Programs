package string;
import java.util.*;
public class Permutation {
	
	public static boolean isPermutation(String str1, String str2) {
		int[] arr = new int[500];
        for (int i = 0; i < str1.length(); i++) {
            arr[(int) str1.charAt(i)] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr[(int) str2.charAt(i)] -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		boolean ans = isPermutation(str1,str2);
		System.out.println(ans);
	}

}
