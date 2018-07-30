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
    def intersect(self, quadTree1, quadTree2):
        """
        :type quadTree1: Node
        :type quadTree2: Node
        :rtype: Node
        """
        if quadTree1.isLeaf and quadTree2.isLeaf:
            return Node(quadTree1.val or quadTree2.val, True, None, None, None, None)
        elif quadTree1.isLeaf and not quadTree2.isLeaf:
            val = quadTree1.val or quadTree2.val
            return Node(
                val,
                quadTree1.val,
                None if quadTree1.val else quadTree2.topLeft,
                None if quadTree1.val else quadTree2.topRight,
                None if quadTree1.val else quadTree2.bottomLeft,
                None if quadTree1.val else quadTree2.bottomRight
            )
        elif not quadTree1.isLeaf and quadTree2.isLeaf:
            val = quadTree1.val or quadTree2.val
            return Node(
                val,
                quadTree2.val,
                None if quadTree2.val else quadTree1.topLeft,
                None if quadTree2.val else quadTree1.topRight,
                None if quadTree2.val else quadTree1.bottomLeft,
                None if quadTree2.val else quadTree1.bottomRight
            )
        else:
            topLeft = self.intersect(quadTree1.topLeft, quadTree2.topLeft)
            topRight = self.intersect(quadTree1.topRight, quadTree2.topRight)
            bottomLeft = self.intersect(quadTree1.bottomLeft, quadTree2.bottomLeft)
            bottomRight = self.intersect(quadTree1.bottomRight, quadTree2.bottomRight)
            isLeaf = topLeft.isLeaf == topRight.isLeaf == bottomLeft.isLeaf == bottomRight.isLeaf == True and topLeft.val == topRight.val == bottomLeft.val == bottomRight.val
            return Node(
                topLeft.val,
                isLeaf,
                topLeft if not isLeaf else None,
                topRight if not isLeaf else None,
                bottomLeft if not isLeaf else None,
                bottomRight if not isLeaf else None
            )
            