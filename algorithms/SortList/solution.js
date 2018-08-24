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
var sortList = function(head) {
    let p = head,
        length = 0
    
    while (p) {
        length++
        p = p.next
    }
    
    if (length > 1) quickSort(head, length)
    return head
};

var quickSort = function (head, length) {
    let pre = head,
        cur = head.next,
        preIndex = 0,
        key = head.val
    
    for (let i = 1; i < length; i++) {
        if (cur.val <= key) {
            if (pre.next.val > key) {
                let temp = pre.next.val
                pre.next.val = cur.val
                cur.val = temp
            }
            pre = pre.next
            preIndex++
        }
        cur = cur.next
    }
    
    let temp = pre.val
    pre.val = key
    head.val = temp
    
    if (preIndex > 1) quickSort(head, preIndex)
    if (length - 1 - preIndex > 1) quickSort(pre.next, length - 1 - preIndex)
};