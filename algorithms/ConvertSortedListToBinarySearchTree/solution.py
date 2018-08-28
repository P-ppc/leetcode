# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sortedListToBST(self, head):
        """
        :type head: ListNode
        :rtype: TreeNode
        """
        length = 0
        p = head
        while p:
            p = p.next
            length += 1
        
        return self.help(head, length)
    
    def help(self, head, length):
        if length == 0: return None
        
        p = head
        mid = length / 2
        
        for i in xrange(mid):
            p = p.next
        
        root = TreeNode(p.val)
        root.left = self.help(head, mid)
        root.right = self.help(p.next, length - mid - 1)
        return root