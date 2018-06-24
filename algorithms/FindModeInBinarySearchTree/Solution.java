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
    public int[] findMode(TreeNode root) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("res", new ArrayList<Integer>());
        params.put("maxCount", 0);
        params.put("curCount", 0);
        params.put("prev", null);
        
        if (root != null) {
            inOrderTraveral(root, params);
        }
        
        List<Integer> res = (ArrayList<Integer>) params.get("res");
        
        int[] array = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }
        return array;
    }
    
    public void inOrderTraveral(TreeNode node, Map<String, Object> params) {
        if (node.left != null) {
            inOrderTraveral(node.left, params);
        }
        
        List<Integer> res = (ArrayList<Integer>) params.get("res");
        int maxCount = (int) params.get("maxCount");
        int curCount = (int) params.get("curCount");
        Integer prev = (Integer) params.get("prev");
        
        if (prev != null && prev.equals(node.val)) {
            curCount++;
        } else {
            curCount = 1;
        }
        
        if (curCount > maxCount) {
            maxCount = curCount;
            res.clear();
            res.add(node.val);
        } else if (curCount == maxCount) {
            res.add(node.val);
        }
        
        prev = node.val;
        
        params.put("res", res);
        params.put("maxCount", maxCount);
        params.put("curCount", curCount);
        params.put("prev", prev);
        
        if (node.right != null) {
            inOrderTraveral(node.right, params);
        }
    }
}