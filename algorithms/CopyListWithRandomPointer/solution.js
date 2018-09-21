/**
 * Definition for singly-linked list with a random pointer.
 * function RandomListNode(label) {
 *     this.label = label;
 *     this.next = this.random = null;
 * }
 */

/**
 * @param {RandomListNode} head
 * @return {RandomListNode}
 */
var copyRandomList = function(head) {
    let dummy = new RandomListNode(-1),
        d = dummy,
        p = head,
        nodeMap = new Map()
    
    while (p) {
        d.next = new RandomListNode(p.label)
        nodeMap.set(p, d.next)
        p = p.next
        d = d.next
    }
    
    d = dummy.next
    while (head) {
        d.random = head.random ? nodeMap.get(head.random) : null
        d = d.next
        head = head.next
    }
    
    return dummy.next
};