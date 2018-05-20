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
    let node = head,
        tempNode = null
    
    head = null
    while (node !== null) {
        let hasDuplicate = false
        while (node.next && node.val === node.next.val) {
            hasDuplicate = true
            node = node.next
        }
        if (hasDuplicate === false) {
            if (tempNode === null) {
                tempNode = new ListNode(node.val)
                head = tempNode
            } else {
                tempNode.next = new ListNode(node.val)
                tempNode = tempNode.next
            }
        }
        node = node.next
    }
    return head
};