package group2test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class ScoreOfBrackets {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String expression = br.readLine().trim();
        System.out.println(scoreOfParentheses(expression));
    }
    
//    static public int scoreOfParentheses(String S) {
//    	Stack<String> s = new Stack<>();
//        int i = 0;
//        int ans = 0;
//        while (i < S.length()) {
//        	if (S.charAt(i) == '(')
//        		s.add("(");
//        	else {
//        		if (s.peek() == "(") {
//        			s.pop();
//        			s.add("1");
//        		}else {
//        			long count = 0;
//        			while (s.peek() != "(") {
//        				count += Integer.parseInt(s.peek());
//        				s.pop();
//        			}
//        			s.pop();
//        			s.add(String.valueOf(3 * count));
//        		}
//        	}
//        	i++;
//        }
//        while (!s.isEmpty()) {
//          ans += Integer.parseInt(s.peek());
//          s.pop();
//        }
//        return ans;
//    }
    
    static public int scoreOfParentheses(String S) {
    	char[] arr = S.toCharArray();
        return 3 * count(arr, 0, arr.length - 1);
    }
    
    static int count(char[] arr, int l, int r){
        if(l >= r ) return 0;
        if(l + 1 == r) return 1;
        int pl = 0, pr = 0;
        int count = 0;
        int part = 0;
        for(int i = l; i <= r; i++){
            if(arr[i] == '(') pl++;
            else pr++;
            if(pl == pr){
                if(i == r && part == 0){
                    return 3 * count(arr, l + 1, r - 1);
                }else{
                    count += count(arr, l, i);
                    part++;
                    l = i + 1;
                }
            }
        }
        return count;
    }
}
