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
var insertionSortList = function(head) {
    let dummy = new ListNode(-1)
    dummy.next = head
    
    let cur = dummy.next,
        pre = cur
    
    while (cur) {
        if (cur.val < pre.val) {
            let next = cur.next
            pre.next = next
            
            let p1 = dummy,
                p2 = dummy.next
            
            while (p2.val < cur.val) {
                p1 = p1.next
                p2 = p2.next
            }
            cur.next = p2
            p1.next = cur
            
            cur = next
        } else {
            pre = cur
            cur = cur.next
        }
    }
    
    return dummy.next
};