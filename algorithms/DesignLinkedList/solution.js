/**
 * Initialize your data structure here.
 */

var Node = function (val) {
    this.val = val
    this.next = null
}

var MyLinkedList = function() {
    this.head = new Node(-1)
    this.length = 0
};

/**
 * Get the value of the index-th node in the linked list. If the index is invalid, return -1. 
 * @param {number} index
 * @return {number}
 */
MyLinkedList.prototype.get = function(index) {
    if (index < 0 || index >= this.length) return -1
    
    let cur = this.head.next
    for (let i = 0; i < index; i++) cur = cur.next
    return cur.val
};

/**
 * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtHead = function(val) {
    this.addAtIndex(0, val)
};

/**
 * Append a node of value val to the last element of the linked list. 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtTail = function(val) {
    this.addAtIndex(this.length, val)
};

/**
 * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. 
 * @param {number} index 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtIndex = function(index, val) {
    if (0 <= index && index <= this.length) {
        let node = new Node(val),
            pre = this.head,
            cur = this.head.next,
            i = 0
        
        while (cur && i++ < index) {
            pre = cur
            cur = cur.next
        }
        
        node.next = cur
        pre.next = node
        this.length++
    }
};

/**
 * Delete the index-th node in the linked list, if the index is valid. 
 * @param {number} index
 * @return {void}
 */
MyLinkedList.prototype.deleteAtIndex = function(index) {
    if (0 <= index && index < this.length) {
        let pre = this.head,
            cur = this.head.next,
            i = 0
        
        while (i++ < index) {
            pre = cur
            cur = cur.next
        }
        pre.next = cur.next
        this.length--
    }
};

/** 
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = Object.create(MyLinkedList).createNew()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */