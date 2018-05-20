# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        node = head
        temp_node = None
        head = None
        while node:
            has_duplicate = False
            while node.next and node.val == node.next.val:
                node = node.next
                has_duplicate = True
            if not has_duplicate:
                if not temp_node:
                    temp_node = ListNode(node.val)
                    head = temp_node
                else:
                    temp_node.next = ListNode(node.val)
                    temp_node = temp_node.next
            node = node.next
        return head