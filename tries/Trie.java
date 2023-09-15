package tries;

import java.util.ArrayList;

public class Trie {
	private TrieNode root;
	private int numWords;

	public Trie() {
		root = new TrieNode('\0');
		numWords = 0;
	}
	

	public void remove(String word){
		if(remove(root, word)) {
			numWords--;
		}
	}
	

	private boolean remove(TrieNode root, String word) {
		if(word.length() == 0){
			if(root.isTerminating) {
				root.isTerminating = false;
				return true;
			}
			else {
				return false;
			}
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		boolean ans = remove(child, word.substring(1));

		if(!child.isTerminating && child.childCount == 0){
			root.children[childIndex] = null;
			child = null;
			root.childCount--;
		}
		return ans;
	}

	private boolean add(TrieNode root, String word){
		if(word.length() == 0){
			if(root.isTerminating) {
				return false;
			}
			else {
				root.isTerminating = true;
				return true;
			}
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		return add(child, word.substring(1));
	}

	public void add(String word){
		if(add(root, word)) {
			numWords++;
		}
	}
	
	private boolean searchHelper(String word, int i, TrieNode node) {
		if(node == null) 
			return false;
        if(i == word.length() - 1) 
        	return node.isTerminating;
        if(word.charAt(++i) != '.') {
            return searchHelper(word, i, node.children[word.charAt(i) - 'a']);
        }else{
            for(int p = 0; p < 26; p++){
                if(searchHelper(word, i, node.children[p])){
                    if(node.children[p] == null) 
                    	continue;
                    return true;
                }
            }
            return false;
        }
	}
	
	public boolean search(String word) {
		return searchHelper(word, -1, root);
	}
	
	private int countWords(TrieNode root) {
		int result = 0;
		if (root.isTerminating)
            result++;
          
        for (int i = 0; i < 26; i++)   
          if (root.children[i] != null )
             result += countWords(root.children[i]);
         
        return result;
	}
	
	public int countWords() {
		return countWords(root);
	}
	
	public boolean patternMatching(ArrayList<String> vect, String pattern) {
		for (int i = 0; i < vect.size(); i++) {
	        String word = vect.get(i); 
	        for (int j = 0; j < word.length(); j++) {
	            add(word.substring(j)); 
	        }
		}
		return searchPattern(root,pattern);
	}
	
	private boolean searchPattern(TrieNode root,String pattern){
        if(pattern.length() == 0)
            return true;
        int childIndex = pattern.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null)
            return false;
        return searchPattern(child,pattern.substring(1));
    }
	
	public boolean isPalindromePair(ArrayList<String> words) {
		ArrayList<String> s= new ArrayList<>();
		for(int i = 0; i< words.size(); i++) {
	        String st= words.get(i);
	        add(st);
	        String str = reversePalindromePair(st);
	        s.add(str);
	    }
		for(int i = 0;i < s.size(); i++) {
	           boolean b = searchPalindromePair(root, s.get(i));
	           if(b == true)
	        	   return true;
		}
		return false;
	}
	
	public boolean searchPalindromePair(TrieNode root,String word) {
	    if(word.length() == 0) {
	        return true;
	    }
	    int ci = word.charAt(0) - 'a';
	    TrieNode chld = root.children[ci];
	    if(chld == null)
	    	return false;
	    return searchPalindromePair(chld, word.substring(1));
    }
	
    private String reversePalindromePair(String i){
        String newstr = "";
        while (i.length() != 0){
            newstr = i.charAt(0) + newstr;
            i = i.substring(1);
        }
        return newstr;
    }
    
    public void autoComplete(ArrayList<String> input, String word) {
    	int i=0; 
        while(i<input.size()){
            String a=input.get(i);
            add(root,a); 
            i++;
         }  
        if(root == null || root.childCount == 0) { 
            return;
        }
       TrieNode a=findword(root,word);
       if(a == null)
    	   return;
        String output = ""; 
        allwords(a,word,output); 
    }
    
    public TrieNode findword(TrieNode root, String word) { 
        if(word.length() == 0){
            return root;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return null; 
        }
        return findword(child, word.substring(1));
    } 
    
    public void allwords(TrieNode root,String word,String output){    
        if(root.childCount == 0) { 
            if(output.length() > 0) {
                System.out.println(word + output); 
            }
            return; 
        }
        if(root.isTerminating == true) {
            System.out.println(word + output);
        }

        for(int i = 0; i < root.children.length; i++) {
            if(root.children[i] != null) {
                String ans = output + root.children[i].data; 
                allwords(root.children[i],word,ans);
            }
       }
    }
}
