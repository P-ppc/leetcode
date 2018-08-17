class Trie {
    private class TrieNode {
        public TrieNode[] children;
        public Character ch;
        public boolean isEnd;
        
        public TrieNode(Character ch) {
            children = new TrieNode[26];
            this.ch = ch;
            this.isEnd = false;
        }
    }
    
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode(null);
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = (int) ch - 97;
            if (node.children[index] == null) {
                node.children[index] = new TrieNode(ch);
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = (int) ch - 97;
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int index = (int) ch - 97;
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */