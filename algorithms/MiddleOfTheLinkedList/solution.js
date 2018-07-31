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
var middleNode = function(head) {
    let length = 0,
        p = head
    
    while (p) {
        p = p.next
        length++
    }
    p = head
    
    for (let i = 0; i < parseInt(length / 2); i++) {
        p = p.next
    }
    
    return p
};