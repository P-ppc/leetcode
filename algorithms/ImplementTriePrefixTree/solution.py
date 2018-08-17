class Trie(object):
    
    class TrieNode(object):
        def __init__(self, char):
            self.char = char
            self.children = [None] * 26
            self.is_end = False
        
    
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.root = self.TrieNode(None)

    def insert(self, word):
        """
        Inserts a word into the trie.
        :type word: str
        :rtype: void
        """
        node = self.root
        for c in word:
            index = ord(c) - 97
            if not node.children[index]:
                node.children[index] = self.TrieNode(c)
            node = node.children[index]
        node.is_end = True

    def search(self, word):
        """
        Returns if the word is in the trie.
        :type word: str
        :rtype: bool
        """
        node = self.root
        for c in word:
            index = ord(c) - 97
            if not node.children[index]:
                return False
            node = node.children[index]
        return node.is_end

    def startsWith(self, prefix):
        """
        Returns if there is any word in the trie that starts with the given prefix.
        :type prefix: str
        :rtype: bool
        """
        node = self.root
        for c in prefix:
            index = ord(c) - 97
            if not node.children[index]:
                return False
            node = node.children[index]
        return True


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)