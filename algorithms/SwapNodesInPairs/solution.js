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
var swapPairs = function(head) {
    let dummy = new ListNode(0),
        p = dummy
    
    dummy.next = head
    
    while (p.next && p.next.next) {
        let temp = p.next
        
        p.next = p.next.next
        temp.next = p.next.next
        p.next.next = temp
        p = p.next.next
    }
    
    return dummy.next
};