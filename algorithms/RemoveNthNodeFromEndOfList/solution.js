/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    let dummy = new ListNode(-1),
        p1 = p2 = dummy
    dummy.next = head
    
    for (let i = 0; i <= n; i++) {
        p2 = p2.next
    }
    
    while (p2) {
        p1 = p1.next
        p2 = p2.next
    }
    
    p1.next = p1.next.next
    
    return dummy.next
};