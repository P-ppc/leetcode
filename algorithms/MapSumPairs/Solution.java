class MapSum {
    
    private class TrieNode {
        public Map<Character, TrieNode> children;
        public Integer val;
        
        public TrieNode () {
            children = new HashMap<Character, TrieNode>();
            val = null;
        }
    }
    
    private TrieNode root;
    /** Initialize your data structure here. */
    public MapSum() {
        root = new TrieNode();
    }
    
    public void insert(String key, int val) {
        TrieNode node = root;
        for (char c : key.toCharArray()) {
            if (node.children.get(c) == null) {
                node.children.put(c, new TrieNode());
            }
            node = node.children.get(c);
        }
        node.val = val;
    }
    
    public int sum(String prefix) {
        int sum = 0;
        TrieNode node = root;
        
        for (char c : prefix.toCharArray()) {
            if (node.children.get(c) == null) {
                return 0;
            }
            node = node.children.get(c);
        }
        
        sum += node.val == null ? 0 : node.val;
        List<TrieNode> stack = new ArrayList<TrieNode>(node.children.values());
        
        while (stack.size() > 0) {
            node = stack.remove(0);
            stack.addAll(node.children.values());
            sum += node.val == null ? 0 : node.val; 
        }
        
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */