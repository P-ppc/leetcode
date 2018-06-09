/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    let p1 = head,
        p2 = head
    
    while (p1 && p2) {
        p1 = p1.next
        p2 = p2.next
        if (p2 && p2.next) {
            if (p1 === p2.next) {
                return true
            } else {
                p2 = p2.next
            }
        }
    }
    
    return false
};