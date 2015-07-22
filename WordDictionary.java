
public class WordDictionary {
	public static void main(String[] args) {
		WordDictionary wordDictionary= new WordDictionary();
		wordDictionary.addWord("pad");
		wordDictionary.addWord("bad");
		System.out.println(wordDictionary.search("pad"));
		System.out.println(wordDictionary.search("b.."));
	}
	public class TrieNode{
		TrieNode[] children;
		boolean isEnd;
		public TrieNode(){
			children = new TrieNode[26];
			isEnd = false;
		}
	}
	

	TrieNode root = new TrieNode();
    // Adds a word into the data structure.
    public void addWord(String word) {
    	TrieNode node = root;
        for(Character c : word.toCharArray()){
        	int index = c-'a';
        	if(node.children[index]==null){
        		node.children[index] = new TrieNode();
        	}
        	node = node.children[index];
        }
        node.isEnd=true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return isMatch(root, word);
    }
    
    boolean isMatch(TrieNode root, String word){
    	char[] array = word.toCharArray();
    	for(int i = 0; i<array.length; i++){
    		char c = array[i];
    		if(c!='.'){
    			int index = c - 'a';
    			if(root.children[index]==null){
    				return false;
    			}
    			root = root.children[index];
    		}
    		else{
    			for(int j = 0; j<26; j++){
    				if(root.children[j]!=null){
    					if(isMatch(root.children[j], word.substring(i+1))){
    						return true;
    					}
    				}
    			}
    			return false;
    		}
    	}
    	if(root.isEnd==true){
    		return true;
    	}
    	else{
    		return false;
    	}
    }

}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
