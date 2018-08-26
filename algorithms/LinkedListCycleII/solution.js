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
var detectCycle = function(head) {
    if (!head) return null
    
    let fast = head,
        slow = head
    
    while (fast.next && fast.next.next) {
        fast = fast.next.next
        slow = slow.next
        
        if (fast == slow) {
            let p = slow.next,
                i = 1
            
            while (p != slow) {
                p = p.next
                i++
            }
                
            let tail = head
            for (let j = 0; j < i; j++) {
                tail = tail.next
            }
            
            while (head != tail) {
                head = head.next
                tail = tail.next
            }
            return head
        }
    }
    
    return null
};