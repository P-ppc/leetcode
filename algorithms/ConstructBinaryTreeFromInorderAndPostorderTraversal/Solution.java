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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    
    public TreeNode build(int[] inorder, int inBeg, int inEnd, int[] postorder, int postBeg, int postEnd) {
        if (inBeg > inEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        int pos = -1;
        for (int i = inBeg; i <= inEnd; i++) {
            if (inorder[i] == postorder[postEnd]) {
                pos = i;
                break;
            }
        }
        root.left = build(inorder, inBeg, pos - 1, postorder, postBeg, postBeg + (pos - inBeg - 1));
        root.right = build(inorder, pos + 1, inEnd, postorder, postBeg + (pos - inBeg), postEnd - 1);
        return root;
    }
}