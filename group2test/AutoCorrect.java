package group2test;
import java.util.Scanner;
class TrieNode {
    TrieNode Trie[];
    boolean isEnd;
    public TrieNode() {
        Trie = new TrieNode[256];
        for(int i = 0; i < 256; i++)
        {
            Trie[i] = null;
        }
        isEnd = false;
    }
}

public class AutoCorrect {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String key = s.next();
		String str[] = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = s.next();
		}
		TrieNode root = new TrieNode();
		for(int i = 0; i < str.length; i++) {
			InsertTrie(root, str[i]);
		}
		if (checkPresent(root, key)) {
			
		}else {
			System.out.println("No suggestions");
		}
	}

	static void InsertTrie(TrieNode root, String s) {
	    TrieNode temp = root; 
	    for(int i = 0; i < s.length(); i++) {
	        if (temp.Trie[s.charAt(i)] == null) {
	            temp.Trie[s.charAt(i)] = new TrieNode();
	        }
	        temp = temp.Trie[s.charAt(i)];
	    }
	    temp.isEnd = true;
	}
	 
	static void printSuggestions(TrieNode root, String res) {
	    if (root.isEnd == true) {
	        System.out.print(res + " ");
	    }
	    for(int i = 0; i < 256; i++) {
	        if (root.Trie[i] != null) {
	            res += (char)i;
	            printSuggestions(root.Trie[i], res);
	            res = res.substring(0, res.length() - 2);
	        }
	    }
	}
	
	static boolean checkPresent(TrieNode root, String key) {
	    for(int i = 0; i < key.length(); i++) {
	        if (root.Trie[key.charAt(i)] == null) {
	            printSuggestions(root, key.substring(0, i));
	            return false;
	        }
	        root = root.Trie[key.charAt(i)];
	    }
	    if (root.isEnd == true) {
	        return true;
	    }
	    printSuggestions(root, key);
	    return false;
	}
}
