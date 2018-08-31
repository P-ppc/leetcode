# Reverse Linked List II
We can solve this problem by dummy node, but why the solution like below often get internal error?
```python
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
        dummy = ListNode(-1)
        dummy.next = head
        cur = dummy
        pre = None
        i = 0
        
        while i < m:
            pre = cur
            cur = cur.next
            i += 1
          
        while i < n:
            temp = pre.next
            pre.next = cur.next
            cur.next = cur.next.next
            pre.next.next = temp
            i += 1
        
        return dummy.next
```