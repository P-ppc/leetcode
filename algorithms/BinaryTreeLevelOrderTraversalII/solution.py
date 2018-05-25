# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        queue = []
        temp_queue = []
        level_values = []
        res = []
        if root:
            queue.append(root)
        while len(queue) > 0:
            node = queue[0]
            queue = queue[1:]
            level_values.append(node.val)
            if node.left:
                temp_queue.append(node.left)
            if node.right:
                temp_queue.append(node.right)
            if len(queue) == 0:
                queue = temp_queue
                res.insert(0, level_values)
                temp_queue = []
                level_values = []
            
        return res