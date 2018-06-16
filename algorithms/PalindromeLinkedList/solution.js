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
var isPalindrome = function(head) {
    let length = 0,
        index = 0,
        p = head
    
    while (p) {
        length++
        p = p.next
    }
    
    p = null
    
    while (index < parseInt(length / 2)) {
        index++
        let temp = p
        p = head
        head = head.next
        p.next = temp
    }
    
    if (length % 2 === 1) {
        head = head.next
    }
    
    while (p && head) {
        if (p.val !== head.val) {
            return false
        } else {
            p = p.next
            head = head.next
        }
    }
    return true
};