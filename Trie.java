
public class Trie {
	
	public class TrieNode {
	    // Initialize your data structure here.
		public boolean isEndOfWord;//presents if this node is end of a word
		public TrieNode[] children;
		
		//construction method
		public TrieNode() {
	        this.isEndOfWord=false;
	        this.children=new TrieNode[26];
	    }
		
	}

	/**
	 * @param args
	 */
	
	// Your Trie object will be instantiated and called as such:
	// Trie trie = new Trie();
	// trie.insert("somestring");
	// trie.search("key");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if(word.length()==0){
        	return;
        }
        else{
        	TrieNode currNode=root;
        	for(char c:word.toCharArray()){
        		if(currNode.children[c-'a']==null){
        			currNode.children[c-'a']=new TrieNode();
        		}
        			currNode=currNode.children[c-'a'];
        	}
        	currNode.isEndOfWord=true;
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
    	if(word.length()==0){
        	return true;
        }
    	else{
    		TrieNode currNode=root;
    		for(char c:word.toCharArray()){
    			if(currNode.children[c-'a']==null){
    				return false;
    			}
    			else{
    				currNode=currNode.children[c-'a'];
    			}
    		}
    		if(currNode.isEndOfWord==true){
    			return true;
    		}
    		else{
    			return false;
    		}
    	}
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
    	if(prefix.length()==0){
        	return true;
        }
    	else{
    		TrieNode currNode=root;
    		for(char c:prefix.toCharArray()){
    			if(currNode.children[c-'a']==null){
    				return false;
    			}
    			else{
    				currNode=currNode.children[c-'a'];
    			}
    		}
    		return true;
    	}
    }

}
