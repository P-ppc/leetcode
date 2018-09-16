/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} x
 * @return {ListNode}
 */
var partition = function(head, x) {
    let dummySmaller = new ListNode(-1),
        dummyBigger = new ListNode(-1),
        pSmaller = dummySmaller,
        pBigger = dummyBigger
    
    while (head) {
        let p = head
        head = head.next
        p.next = null
        
        if (p.val < x) {
            pSmaller.next = p
            pSmaller = pSmaller.next
        } else {
            pBigger.next = p
            pBigger = pBigger.next
        }
    }
    
    pSmaller.next = dummyBigger.next
    return dummySmaller.next
};