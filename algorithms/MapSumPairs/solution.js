/**
 * Initialize your data structure here.
 */
var MapSum = function() {
    this.root = new TrieNode()
};

var TrieNode = function() {
    this.children = {}
    this.val = null
}

/** 
 * @param {string} key 
 * @param {number} val
 * @return {void}
 */
MapSum.prototype.insert = function(key, val) {
    let node = this.root
    
    for (let i = 0; i < key.length; i++) {
        let char = key[i]
        if (node.children[char] === undefined) {
            node.children[char] = new TrieNode()
        }
        node = node.children[char]
    }
    
    node.val = val
};

/** 
 * @param {string} prefix
 * @return {number}
 */
MapSum.prototype.sum = function(prefix) {
    let sum = 0,
        node = this.root
    
    for (let i = 0; i < prefix.length; i++) {
        let char = prefix[i]
        if (node.children[char] === undefined) {
            return 0
        }
        node = node.children[char]
    }
    
    sum += node.val ? node.val : 0
    let stack = Object.values(node.children)
    while (stack.length > 0) {
        node = stack.pop()
        stack = stack.concat(Object.values(node.children))
        sum += node.val ? node.val : 0
    }
    
    return sum
};

/** 
 * Your MapSum object will be instantiated and called as such:
 * var obj = Object.create(MapSum).createNew()
 * obj.insert(key,val)
 * var param_2 = obj.sum(prefix)
 */