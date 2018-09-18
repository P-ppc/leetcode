/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let dummy = new ListNode(-1),
        carry = 0,
        stack1 = [],
        stack2 = []
    
    while (l1) {
        stack1.push(l1)
        l1 = l1.next
    }
    
    while (l2) {
        stack2.push(l2)
        l2 = l2.next
    }
    
    while (stack1.length && stack2.length) {
        let node1 = stack1.pop(),
            node2 = stack2.pop(),
            temp = dummy.next,
            val = (node1.val + node2.val + carry) % 10
        
        carry = parseInt((node1.val + node2.val + carry) / 10)
        dummy.next = new ListNode(val)
        dummy.next.next = temp
    }
    
    let stack = stack1.length ? stack1 : stack2
    while (stack.length) {
        let node = stack.pop(),
            temp = dummy.next,
            val = (node.val + carry) % 10
        
        carry = parseInt((node.val + carry) / 10)
        dummy.next = new ListNode(val)
        dummy.next.next = temp
    }
    
    
    if (carry) {
        let temp = dummy.next
        dummy.next = new ListNode(carry)
        dummy.next.next = temp
    }
        
    return dummy.next
};