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
    public int maxDepth(Node root) {
        int depth = 0;
        ArrayList<Node> stack = new ArrayList<Node>(),
                            nextStack = new ArrayList<Node>();
        
        if (root != null) stack.add(root);
        
        while (stack.size() > 0) {
            Node node = stack.get(0);
            stack.remove(0);
            nextStack.addAll(node.children);
            
            if (stack.size() == 0) {
                depth++;
                stack = nextStack;
                nextStack = new ArrayList<Node>();
            }
        }
        
        return depth;
    }
}