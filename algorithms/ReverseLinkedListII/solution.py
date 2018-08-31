# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseBetween(self, head, m, n):
        """
        :type head: ListNode
        :type m: int
        :type n: int
        :rtype: ListNode
        """
        if m == n: return head
        
        dummy = ListNode(-1)
        dummy.next = head
        pre = dummy
        
        for i in xrange(m - 1):
            pre = pre.next
        
        # reverse the [m, n] nodes
        reverse = None
        cur = pre.next
        
        for i in xrange(n - m + 1):
            nxt = cur.next
            cur.next = reverse
            reverse = cur
            cur = nxt
        # the tail of reverse
        pre.next.next = cur
        pre.next = reverse
        
        return dummy.next