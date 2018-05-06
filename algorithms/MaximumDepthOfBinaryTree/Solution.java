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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        List<Integer> depthList = new ArrayList<Integer>();
        List<Map<String, Object>> depthMapList = new ArrayList<Map<String, Object>>();
        Map<String, Object> rootDepthMap = new HashMap<String, Object>();
        rootDepthMap.put("node", root);
        rootDepthMap.put("depth", 1);
        depthMapList.add(rootDepthMap);
        
        while (depthMapList.size() > 0) {
            Map<String, Object> depthMap = depthMapList.get(0);
            depthMapList.remove(0);
            TreeNode node = (TreeNode) depthMap.get("node");
            int depth = (int) depthMap.get("depth");
            if (node.left != null) {
                Map<String, Object> leftDepthMap = new HashMap<String, Object>();
                leftDepthMap.put("node", node.left);
                leftDepthMap.put("depth", depth + 1);
                depthMapList.add(leftDepthMap);
            }
            if (node.right != null) {
                Map<String, Object> rightDepthMap = new HashMap<String, Object>();
                rightDepthMap.put("node", node.right);
                rightDepthMap.put("depth", depth + 1);
                depthMapList.add(rightDepthMap);
            }
            if (node.left == null && node.right == null) {
                depthList.add(depth);
            }
        }
        
        int maxDepth = depthList.get(0);
        for (int depth : depthList) {
            if (depth > maxDepth) {
                maxDepth = depth;
            }
        }
        return maxDepth;
    }
}