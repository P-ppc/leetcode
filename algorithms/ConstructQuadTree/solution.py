"""
# Definition for a QuadTree node.
class Node(object):
    def __init__(self, val, isLeaf, topLeft, topRight, bottomLeft, bottomRight):
        self.val = val
        self.isLeaf = isLeaf
        self.topLeft = topLeft
        self.topRight = topRight
        self.bottomLeft = bottomLeft
        self.bottomRight = bottomRight
"""
class Solution(object):
    def construct(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: Node
        """
        return self.helper(grid, 0, len(grid) - 1, 0, len(grid) - 1)
    
    def helper(self, grid, left, right, top, bottom):
        if right == left:
            return Node(grid[top][left] == 1, True, None, None, None, None)
        else:
            topLeft = self.helper(grid, left, (left + right) / 2, top, (top + bottom) / 2)
            topRight = self.helper(grid, (left + right) / 2 + 1, right, top, (top + bottom) / 2)
            bottomLeft = self.helper(grid, left, (left + right) / 2, (top + bottom) / 2 + 1, bottom)
            bottomRight = self.helper(grid, (left + right) / 2 + 1, right, (top + bottom) / 2 + 1, bottom)
            isLeaf = topLeft.isLeaf == topRight.isLeaf == bottomLeft.isLeaf == bottomRight.isLeaf == True and topLeft.val == topRight.val == bottomLeft.val == bottomRight.val == grid[top][left]
            return Node(
                grid[top][left] == 1,
                isLeaf,
                topLeft if not isLeaf else None,
                topRight if not isLeaf else None,
                bottomLeft if not isLeaf else None,
                bottomRight if not isLeaf else None
            )