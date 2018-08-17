/**
 * Initialize your data structure here.
 */
var Trie = function() {
    this.root = new TrieNode(null)
};

var TrieNode = function (char) {
    this.char = char
    this.children = new Array(26);
    this.children.fill(null)
    this.isEnd = false
}

/**
 * Inserts a word into the trie. 
 * @param {string} word
 * @return {void}
 */
Trie.prototype.insert = function(word) {
    let node = this.root
    for (let i = 0; i < word.length; i++) {
        let char = word[i],
            index = char.charCodeAt(0) - 97
        
        if (!node.children[index]) {
            node.children[index] = new TrieNode(char)
        }
        node = node.children[index]
    }
    node.isEnd = true
};

/**
 * Returns if the word is in the trie. 
 * @param {string} word
 * @return {boolean}
 */
Trie.prototype.search = function(word) {
    let node = this.root
    for (let i = 0; i < word.length; i++) {
        let char = word[i],
            index = char.charCodeAt(0) - 97
        
        if (!node.children[index]) {
            return false
        }
        node = node.children[index]
    }
    return node.isEnd
};

/**
 * Returns if there is any word in the trie that starts with the given prefix. 
 * @param {string} prefix
 * @return {boolean}
 */
Trie.prototype.startsWith = function(prefix) {
    let node = this.root
    for (let i = 0; i < prefix.length; i++) {
        let char = prefix[i],
            index = char.charCodeAt(0) - 97
        
        if (!node.children[index]) {
            return false
        }
        node = node.children[index]
    }
    return true
};

/** 
 * Your Trie object will be instantiated and called as such:
 * var obj = Object.create(Trie).createNew()
 * obj.insert(word)
 * var param_2 = obj.search(word)
 * var param_3 = obj.startsWith(prefix)
 */