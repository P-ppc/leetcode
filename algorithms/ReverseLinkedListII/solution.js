/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} m
 * @param {number} n
 * @return {ListNode}
 */
var reverseBetween = function(head, m, n) {
    if (m == n) return head
    
    let dummy = new ListNode(-1),
        pre = dummy
    dummy.next = head
    
    for (let i = 0; i < m - 1; i++) pre = pre.next
    
    let reverse = null,
        cur = pre.next
    
    for (let i = 0; i < n - m + 1; i++) {
        let next = cur.next
        cur.next = reverse
        reverse = cur
        cur = next
    }
    // the tail of reverse
    pre.next.next = cur
    pre.next = reverse
    
    return dummy.next
};