# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None
        
        fast = head
        slow = head
        
        while slow.next and slow.next.next:
            fast = fast.next
            slow = slow.next.next
            if fast == slow:
                p = fast.next
                i = 1
                while p != fast:
                    p = p.next
                    i += 1
                    
                tail = head
                for j in xrange(i):
                    tail = tail.next
                
                while head != tail:
                    head = head.next
                    tail = tail.next
                return head
        
        return None
        