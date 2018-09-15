/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    let length = 0,
        p = head,
        tail = head
    
    while (p) {
        tail = p
        p = p.next
        length++
    }
    
    if (length == 0 || k % length == 0)
        return head
    
    k %= length
    tail.next = head
    p = head
    
    for (let i = 0; i++ < length - k - 1;)
        p = p.next
    
    let temp = p.next
    p.next = null
    return temp
};