/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    let res = null,
        cur = null
    
    while (head !== null) {
        if (head.val !== val) {
            if (res === null) {
                res = new ListNode(head.val)
                cur = res
            } else {
                cur.next = new ListNode(head.val)
                cur = cur.next
            }
        }
        head = head.next
    }
    
    return res
};