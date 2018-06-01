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
var reverseList = function(head) {
    return reverseListRecursively(null, head)
};

var reverseListRecursively = function (pre, cur) {
    if (cur === null) return null
    if (cur.next === null) {
        cur.next = pre
        return cur
    }
    
    next = cur.next
    cur.next = pre
    return reverseListRecursively(cur, next)
}