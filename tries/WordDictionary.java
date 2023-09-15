package tries;

public class WordDictionary {
	TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        int len = word.length();
        TrieNode temp = root;
        for(int i = 0; i < len; i++){
            int c = word.charAt(i) - 'a';
            if(temp.child[c] == null)
                temp.child[c] = new TrieNode();
            temp = temp.child[c];
        }
        temp.isLeaf = true;
    }
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(word, -1, root);
    }
    private boolean search(String word, int i, TrieNode node){
        if(node == null) return false;
        if(i == word.length() - 1) return node.isLeaf;
        if(word.charAt(++i) != '.'){
            return search(word, i, node.child[word.charAt(i) - 'a']);
        }else{
            for(int p = 0; p < 26; p++){
                if(search(word, i, node.child[p])){
                    if(node.child[p] == null) continue;
                    return true;
                }
            }
            return false;
        }
    }
    private void removeHelper(TrieNode root, String word) {
    	TrieNode t = new TrieNode();
    	if(word.length() == 0) {
    		t.isLeaf = true;
    		return;
    	}
    	int childIndex = word.charAt(0) - 'a';
    	TrieNode child = root.child[childIndex];
    	if(child == null)
    		return;
    	removeHelper(root, word.substring(1));
    }
    public void remove(String word) {
    	removeHelper(root,word);
    }
    
    public static class TrieNode{
        TrieNode[] child;
        boolean isLeaf;
        TrieNode(){
            child = new TrieNode[26];
            isLeaf = false;
        }
    }
}
