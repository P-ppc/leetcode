# Reverse Linked List
This problem is easy to solve, the loop solution is like below:
```
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        tail = None
        
        while head:
            tail, head, tail.next = head, head.next, tail
            ```
            equals:
            >>> temp = tail
            >>> tail = head
            >>> head = head.next
            >>> tail.next = temp
            ```
            
        return tail
```