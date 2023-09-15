package group2test;

import java.io.*;
import java.util.*;

public class MinChar {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String input = br.readLine();
			System.out.println(minCharDeletion(input));
		}
	}
	
	public static int minCharDeletion(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        int count = 0;
        for(char c: ch){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }
        ArrayList<Integer> frequencies = new ArrayList<>(map.values());
        HashSet<Integer> set = new HashSet<Integer>();
        for(int value: frequencies){
            if(!set.contains(value)){
                set.add(value);
            }else{
                while(value > 0 && set.contains(value)){
                    value--;
                    count++;
                }
                set.add(value);
            }
        }
        return count;
	}
}
