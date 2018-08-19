/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var oddEvenList = function(head) {
    if (!head) return null
    
    let length = 0,
        tail = head,
        node = head
    
    while (node) {
        length++
        tail = node
        node = node.next
    }
    
    let pre = head,
        i = 1
    node = pre.next

    while (i < length && node.next) {
        pre.next = node.next
        node.next = null
        tail.next = node
        tail = tail.next
        pre = pre.next
        node = pre.next     
        i += 2
    }
    
    return head
};