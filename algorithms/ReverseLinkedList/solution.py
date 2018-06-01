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
        return self.reverseListRecursively(None, head)
    
    def reverseListRecursively(self, pre, cur):
        if cur == None:
            return None
        if cur.next == None:
            cur.next = pre
            return cur
        nxt = cur.next
        cur.next = pre
        return self.reverseListRecursively(cur, nxt)
        