class MapSum(object):
    
    class TrieNode(object):
        def __init__(self, char):
            self.char = char
            self.children = {}
            self.val = None
    
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.root = self.TrieNode(None)

    def insert(self, key, val):
        """
        :type key: str
        :type val: int
        :rtype: void
        """
        node = self.root
        for c in key:
            if node.children.get(c) == None:
                node.children[c] = self.TrieNode(c)
            node = node.children[c]
        node.val = val

    def sum(self, prefix):
        """
        :type prefix: str
        :rtype: int
        """
        sm = 0
        node = self.root
        
        for c in prefix:
            if node.children.get(c) == None:
                return 0
            node = node.children[c]
            
        sm += node.val if node.val else 0
        
        stack = node.children.values()
        while len(stack) > 0:
            node = stack.pop()
            stack += node.children.values()
            sm += node.val if node.val else 0
        
        # or use recursive
        # for key in node.children:
        #    sm += self.sum(prefix + key)
        
        return sm


# Your MapSum object will be instantiated and called as such:
# obj = MapSum()
# obj.insert(key,val)
# param_2 = obj.sum(prefix)