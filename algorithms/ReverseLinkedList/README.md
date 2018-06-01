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
        node = None
        while head:
            temp = ListNode(head.val)
            temp.next = node
            node = temp
            head = head.next
        return node
```