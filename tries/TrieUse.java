package tries;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrieUse {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 public static ArrayList<String> takeInput() throws IOException {
	        ArrayList<String> words = new ArrayList<>();
	        int n = Integer.parseInt(br.readLine().trim());
	        if (n == 0) {
	            return words;
	        }	        
	        String[] listOfWords; 
	        listOfWords = br.readLine().split("\\s");	        
	        for (int i = 0; i < n; ++i) {
	            words.add(listOfWords[i]);
	        }
	        return words;
	    }

	public static void main(String[] args) throws NumberFormatException, IOException {
//		WordDictionary obj = new WordDictionary();
//		obj.addWord("abc");
//		obj.addWord("note");
//		
//		System.out.println(obj.search("abc"));
//		System.out.println(obj.search("note"));
//		obj.remove("abc");
//		System.out.println(obj.search("abc"));
//		System.out.println(obj.search("note"));
		
		Trie obj = new Trie();
//		obj.add("abc");
//		obj.add("note");
//		System.out.println(obj.search("abc"));
//		System.out.println(obj.search("note"));
//		System.out.println(obj.countWords());
//		obj.remove("abc");
//		obj.remove("note");
//		System.out.println(obj.search("abc"));
//		System.out.println(obj.search("note"));
//		System.out.println(obj.countWords());
		
//		int n = Integer.parseInt(br.readLine().trim());
//        ArrayList<String> input = new ArrayList<String>();
//        String[] words = br.readLine().split("\\s");
//		for(int i = 0; i < n; i++) {
//			
//			input.add(words[i]);
//		}
//		String pattern = br.readLine();
//		System.out.println(obj.patternMatching(input, pattern));
//		
//		 ArrayList<String> word = takeInput();
//		 System.out.println(obj.isPalindromePair(word));
		
		int n = Integer.parseInt(br.readLine().trim());
        ArrayList<String> input = new ArrayList<String>();
        String[] words = br.readLine().split("\\s");
		for(int i = 0; i < n; i++) {
			
			input.add(words[i]);
		}
		String pattern = br.readLine();
		obj.autoComplete(input, pattern);
	}
}