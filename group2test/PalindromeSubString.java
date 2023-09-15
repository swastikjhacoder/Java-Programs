package group2test;
import java.util.*;
public class PalindromeSubString {
	public static boolean isPalindrome(String str, int L, int R) {
        while (R > L) {
            if (str.charAt(L++) != str.charAt(R--)) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = str.length();
 
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(s.nextInt(), s.nextInt()),
                Arrays.asList(s.nextInt(), s.nextInt()),
                Arrays.asList(s.nextInt(), s.nextInt()),
                Arrays.asList(s.nextInt(), s.nextInt()));
 
        for (List<Integer> q : queries) {
            boolean result = isPalindrome(str, q.get(0), q.get(1));
            if (result) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
