package recursion3;

import java.util.HashMap;
import java.util.Scanner;

public class KeypadSolution {
	
	public static String[] keypad(int n) {
		if(n == 0||n == 1) {
	        String ans[]={""};
	        return ans;
		}
		int num =n % 10;
	    String[] ans = keypad(n/10);
	    String helpans = helper(num);
	    String finalans[] = new String[helpans.length() * ans.length];
	    int k = 0;
	    for(int i = 0; i < ans.length; i++) {
	    	for(int j = 0; j <helpans.length(); j++) {
		    	finalans[k] = ans[i] + helpans.charAt(j);
		    	k++;
	    	}
	    }
	    return finalans;
	}

	private static String helper(int num){
		if(num==2)
	    	return "abc";
		if(num==3)
	    	return "def";
		if(num==4)
	    	return "ghi";
		if(num==5)
	    	return "jkl";
		if(num==6)
	    	return "mno";
		if(num==7)
	    	return "pqrs";
		if(num==8)
	    	return "tuv";
		if(num==9)
	    	return "wxyz";
		else
	    	return "";
	}
	
	public static String dial(int key){
        HashMap<Integer,String> dialKey = new HashMap<>();
        dialKey.put(0,"");
        dialKey.put(1,"");
        dialKey.put(2,"abc");
        dialKey.put(3,"def");
        dialKey.put(4,"ghi");
        dialKey.put(5,"jkl");
        dialKey.put(6,"mno");
        dialKey.put(7,"pqrs");
        dialKey.put(8,"tuv");
        dialKey.put(9,"wxyz");
        return dialKey.get(key);
    }
	
	public static void printK(int num,String out){
        if(num == 0){
            System.out.println(out);
            return;
        }
        String pd = dial(num % 10);
        for(int i = 0; i < pd.length(); i++) {
        	printK(num / 10, pd.charAt(i) + out);
        }
    }
	
	public static void printKeypad(int input){
	    printK(input,"");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
//		String output[] = keypad(input);
//		for(int i = 0; i < output.length; i++) {
//			System.out.println(output[i]);
//		}
		printKeypad(input);
		s.close();
	}

}
