/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    public TreeNode build(int[] preorder, int preBeg, int preEnd, int[] inorder, int inBeg, int inEnd) {
        if (inBeg > inEnd) return null;
        
        TreeNode root = new TreeNode(preorder[preBeg]);
        int pos = -1;
        
        for (int i = inBeg; i <= inEnd; i++) {
            if (preorder[preBeg] == inorder[i]) {
                pos = i;
                break;
            }
        }
        
        root.left = build(preorder, preBeg + 1, preBeg + pos - inBeg, inorder, inBeg, pos - 1);
        root.right = build(preorder, preBeg + pos - inBeg + 1, preEnd, inorder, pos + 1, inEnd);
            
        return root;
    }
}