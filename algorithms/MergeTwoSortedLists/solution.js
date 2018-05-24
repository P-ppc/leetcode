/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    let head = res = null
    
    while (l1 !== null && l2 !== null) {
        if (res === null) {
            head = res = new ListNode(Math.min(l1.val, l2.val))
        } else {
            head.next = new ListNode(Math.min(l1.val, l2.val))
            head = head.next
        }
        if (l1.val <= l2.val) {
            l1 = l1.next
        } else {
            l2 = l2.next
        }
    }
    
    if (res === null) {
        res = l1 !== null ? l1 : l2
    } else {
        head.next = l1 !== null ? l1 : l2
    }
    
    return res
};