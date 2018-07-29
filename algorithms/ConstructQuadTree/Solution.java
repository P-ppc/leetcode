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
    public Node construct(int[][] grid) {
        return helper(grid, 0, grid.length - 1, 0, grid.length - 1);
    }
    
    public Node helper(int[][] grid, int left, int right, int top, int bottom) {
        if (left == right) {
            return new Node(grid[top][left] == 1, true, null, null, null, null);
        } else {
            Node topLeft = helper(grid, left, (left + right) / 2, top, (top + bottom) / 2),
                 topRight = helper(grid, (left + right) / 2 + 1, right, top, (top + bottom) / 2),
                 bottomLeft = helper(grid, left, (left + right) / 2, (top + bottom) / 2 + 1, bottom),
                 bottomRight = helper(grid, (left + right) / 2 + 1, right, (top + bottom) / 2 + 1, bottom);
            
            boolean val = grid[top][left] == 1;
            boolean isLeaf = topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf &&
                             val == topLeft.val && val == topRight.val && val == bottomLeft.val && val == bottomRight.val;
            return new Node(
                val,
                isLeaf,
                isLeaf ? null : topLeft,
                isLeaf ? null : topRight,
                isLeaf ? null : bottomLeft,
                isLeaf ? null : bottomRight
            );
        }
    }
}