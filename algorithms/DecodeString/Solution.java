class Solution {
    public String decodeString(String s) {
        LinkedList<String> stack = new LinkedList<String>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ']') {
                StringBuilder strSb = new StringBuilder();
                while (stack.size() > 0 && !stack.peek().equals("["))
                    strSb.insert(0, stack.pop());
                stack.pop();
                
                StringBuilder intSb = new StringBuilder();
                while (stack.size() > 0 && stack.peek().matches("\\d+"))
                    intSb.insert(0, stack.pop());
                
                String temp = strSb.toString();
                strSb = new StringBuilder();
                for (int i = 0; i < Integer.valueOf(intSb.toString()); i++)
                    strSb.append(temp);
                stack.push(strSb.toString());
            } else {
                stack.push(String.valueOf(c));
            }
        }
        
        while (stack.size() > 0)
            sb.append(stack.pollLast());
        return sb.toString();
    }
}