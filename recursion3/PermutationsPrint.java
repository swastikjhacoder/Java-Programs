package recursion3;

import java.util.Scanner;

public class PermutationsPrint {
	
	public static void permutations(String input) {
		printPermutations(input,"");
	}
	
	private static void printPermutations(String input,String output){
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }
        for(int i=0;i<input.length();i++) {
            String str = input.substring(0,i) + input.substring(i+1,input.length());    
            printPermutations(str , output + input.charAt(i));
        }   
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		permutations(input);
		s.close();
	}

}
