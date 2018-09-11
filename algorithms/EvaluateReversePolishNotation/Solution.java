class Solution {
    public int evalRPN(String[] tokens) {
        LinkedList<String> stack = new LinkedList<String>();
        String ops = "+-*/";
        
        for (String token : tokens) {
            if (ops.indexOf(token) != -1) {
                int value2 = Integer.valueOf(stack.pop()),
                    value1 = Integer.valueOf(stack.pop());
                String value = null;
                
                if (token.equals("+"))
                    value = String.valueOf(value1 + value2);
                else if (token.equals("-"))
                    value = String.valueOf(value1 - value2);
                else if (token.equals("*"))
                    value = String.valueOf(value1 * value2);
                else if (token.equals("/"))
                    value = String.valueOf(value1 / value2);
                stack.push(value);
            } else {
                stack.push(token);
            }
        }
        
        return stack.size() > 0 ? Integer.valueOf(stack.getFirst()) : 0;
    }
}