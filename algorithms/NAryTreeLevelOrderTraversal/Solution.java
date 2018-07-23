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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> values = new ArrayList<Integer>();
        List<Node> stack = new ArrayList<Node>(),
                   nextStack = new ArrayList<Node>();
        
        if (root != null) stack.add(root);
        
        while (stack.size() > 0) {
            Node node = stack.get(0);
            stack.remove(0);
            values.add(node.val);
            nextStack.addAll(node.children);
            
            if (stack.size() == 0) {
                stack = nextStack;
                res.add(values);
                nextStack = new ArrayList<Node>();
                values = new ArrayList<Integer>();
            }
        }
        
        return res;
    }
}