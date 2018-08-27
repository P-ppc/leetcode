/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {void} Do not return anything, modify head in-place instead.
 */
var reorderList = function(head) {
    if (!head) return
    
    let stack = [],
        reveredStack = [],
        length = 0
    while (head) {
        stack.push(head)
        reveredStack.unshift(head)
        head = head.next
        length++
    }
    
    let p = new ListNode(-1)
    for (let i = 0; i < length; i++) {
        p.next = i % 2 == 0 ? reveredStack.pop() : stack.pop()
        p = p.next
        p.next = null
    }
};