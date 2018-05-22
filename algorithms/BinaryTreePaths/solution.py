# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def binaryTreePaths(self, root):
        """
        :type root: TreeNode
        :rtype: List[str]
        """
        if not root:
            return []
        paths = [
            {
                'node': root,
                'path': str(root.val)
            }
        ]
        res = []
        while len(paths) > 0:
            path = paths.pop()
            if not path['node'].left and not path['node'].right:
                res.append(path['path'])
            if path['node'].right:
                paths.append({
                    'node': path['node'].right,
                    'path': path['path'] + '->' + str(path['node'].right.val)
                })
            if path['node'].left:
                paths.append({
                    'node': path['node'].left,
                    'path': path['path'] + '->' + str(path['node'].left.val)
                })
        return res