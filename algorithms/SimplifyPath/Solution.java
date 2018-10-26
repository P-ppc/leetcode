class Solution {
    public String simplifyPath(String path) {
        LinkedList<String> stack = new LinkedList<String>();
        StringBuilder sb = new StringBuilder();
        
        for (String part : path.split("/")) {
            if (!part.equals("") && !part.equals(".") && !part.equals(".."))
                stack.push(part);
            else if (part.equals("..") && stack.size() > 0)
                stack.pop();
        }
        
        if (stack.size() == 0)
            sb.append("/");
        
        while (stack.size() > 0) {
            sb.append("/");
            sb.append(stack.pollLast());
        }
        
        return sb.toString();
    }
}