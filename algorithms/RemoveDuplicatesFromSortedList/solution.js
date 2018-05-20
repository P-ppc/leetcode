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
var deleteDuplicates = function(head) {
    if (head === null) {
        return null
    }
    let node = head
    while (node !== null) {
        while (node.next !== null && node.val === node.next.val) {
            node.next = node.next.next
        }
        node = node.next
    }
    return head
};