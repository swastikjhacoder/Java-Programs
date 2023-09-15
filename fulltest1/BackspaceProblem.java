package fulltest1;
import java.util.*;
public class BackspaceProblem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String n=s.next();
        String x=backspace(n);
        System.out.print(x);
        s.close();
	}

	public static String backspace(String s){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='#'){
                s = s.substring(0,i-1)+s.substring(i+1);
                i-=2;
            }
        }
        return s;
    }
}
