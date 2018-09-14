/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} root
 * @param {number} k
 * @return {ListNode[]}
 */
var splitListToParts = function(root, k) {
    let res = [],
        length = 0,
        p = root
    
    while (p) {
        p = p.next
        length++
    }
    
    let quotient = parseInt(length / k),
        remainder = length % k
    
    p = root
    let pre = p,
        i = 0
    
    while (p) {
        if (i++ == 0)
            res.push(p)
        
        pre = p
        p = p.next
        
        if (remainder > 0 && i == quotient + 1) {
            remainder--
            pre.next = null
            i = 0
        } else if (remainder == 0 && i == quotient) {
            pre.next = null
            i = 0
        }
    }
    
    while (res.length < k)
        res.push(null)
    
    return res
};