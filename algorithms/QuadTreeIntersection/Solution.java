/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
class Solution {
    public Node intersect(Node quadTree1, Node quadTree2) {
        if (quadTree1.isLeaf && quadTree2.isLeaf) {
            return new Node(quadTree1.val || quadTree2.val, true, null, null, null, null);
        } else if (!quadTree1.isLeaf && !quadTree2.isLeaf) {
            Node topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft),
                 topRight = intersect(quadTree1.topRight, quadTree2.topRight),
                 bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft),
                 bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
            
            boolean val = topLeft.val;
            boolean isLeaf = topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf &&
                             val == topRight.val && val == bottomLeft.val && val == bottomRight.val;
            return new Node(
                val,
                isLeaf,
                isLeaf ? null : topLeft,
                isLeaf ? null : topRight,
                isLeaf ? null : bottomLeft,
                isLeaf ? null : bottomRight
            );
        } else {
            Node node = quadTree1.isLeaf ? quadTree1 : quadTree2,
                 node1 = quadTree1.isLeaf ? quadTree2 : quadTree1;
            return new Node(
                quadTree1.val || quadTree2.val,
                node.val,
                node.val ? null : node1.topLeft,
                node.val ? null : node1.topRight,
                node.val ? null : node1.bottomLeft,
                node.val ? null : node1.bottomRight
            );
        }
    }
}