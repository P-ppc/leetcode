/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    let p1 = headA,
        p2 = headB,
        length1 = 0,
        length2 = 0
    
    while (p1) {
        length1++
        p1 = p1.next
    }
    
    while (p2) {
        length2++
        p2 = p2.next
    }
    
    while (length1 > length2) {
        headA = headA.next
        length1--
    }
    
    while (length2 > length1) {
        headB = headB.next
        length2--
    }
    
    while (headA) {
        if (headA === headB) {
            return headA
        } else {
            headA = headA.next
            headB = headB.next
        }
    }
    
    return null
};