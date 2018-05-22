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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        List<Map<String, Object>> paths = new ArrayList<Map<String, Object>>();
        
        if (root == null) return res;
        
        Map<String, Object> rootPath = new HashMap<String, Object>();
        rootPath.put("node", root);
        rootPath.put("path", String.valueOf(root.val));
        paths.add(rootPath);
        
        while (paths.size() > 0) {
            Map<String, Object> nodePath = paths.get(paths.size() - 1);
            paths.remove(paths.size() - 1);
            TreeNode node = (TreeNode) nodePath.get("node");
            String path = (String) nodePath.get("path");
            if (node.left == null && node.right == null) {
                res.add(path);
            } 
            if (node.left != null) {
                nodePath = new HashMap<String, Object>();
                nodePath.put("node", node.left);
                nodePath.put("path", path + "->" + String.valueOf(node.left.val));
                paths.add(nodePath);
            }
            if (node.right != null) {
                nodePath = new HashMap<String, Object>();
                nodePath.put("node", node.right);
                nodePath.put("path", path + "->" + String.valueOf(node.right.val));
                paths.add(nodePath);
            }
        }
        
        return res;
    }
}