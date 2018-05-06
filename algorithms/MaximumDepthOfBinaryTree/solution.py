# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        
        depth_list = []
        depth_map_list = [
            {
                'node': root,
                'depth': 1
            }
        ]
        while len(depth_map_list) > 0:
            depth_map = depth_map_list.pop()
            if depth_map['node'].right:
                depth_map_list.insert(0, {
                    'node': depth_map['node'].right,
                    'depth': depth_map['depth'] + 1
                })
            if depth_map['node'].left:
                depth_map_list.insert(0, {
                    'node': depth_map['node'].left,
                    'depth': depth_map['depth'] + 1
                })
            if depth_map['node'].right is None and depth_map['node'].left is None:
                depth_list.append(depth_map['depth'])
        
        return max(depth_list)
        