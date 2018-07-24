/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (root != null) {
            for (Node node : root.children) {
                res.addAll(postorder(node));
            }
            res.add(root.val);            
        }
        
        return res;
    }
}