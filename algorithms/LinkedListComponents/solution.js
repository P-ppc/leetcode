/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number[]} G
 * @return {number}
 */
var numComponents = function(head, G) {
    let count = 0,
        flag = false
    
    while (head) {
        if (G.indexOf(head.val) != -1) {
            if (!flag) {
                count++
                flag = true
            }
        } else {
            flag = false
        }
        head = head.next
    }
    
    return count
};