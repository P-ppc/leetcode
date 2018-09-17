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
var addTwoNumbers = function(l1, l2) {
    let dummy = new ListNode(-1),
        p = dummy,
        carry = 0
    
    while (l1 && l2) {
        let val = (l1.val + l2.val + carry) % 10
        carry = parseInt((l1.val + l2.val + carry) / 10)
        p.next = new ListNode(val)
        p = p.next
        l1 = l1.next
        l2 = l2.next
    }
    
    let remainder = l1 ? l1 : l2
    while (remainder) {
        let val = (remainder.val + carry) % 10
        carry = parseInt((remainder.val + carry) / 10)
        p.next = new ListNode(val)
        p = p.next
        remainder = remainder.next
    }
    
    if (carry)
        p.next = new ListNode(carry)
    
    return dummy.next
};