/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {TreeNode}
 */
var sortedListToBST = function(head) {
    let length = 0,
        p = head
    
    while (p) {
        p = p.next
        length++
    }

    return help(head, length)
};

var help = function (head, length) {
    if (length == 0) return null
        
    let p = head,
        mid = parseInt(length / 2)
    
    for (let i = 0; i < mid; i++) p = p.next

    let root = new TreeNode(p.val)
    root.left = help(head, mid)
    root.right = help(p.next, length - mid - 1)
    return root    
};
