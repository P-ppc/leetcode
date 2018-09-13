class Solution {
    public int scoreOfParentheses(String S) {
        List<String> stack = new ArrayList<String>();
        
        for (int i = 0; i < S.length(); i++) {
            String c = S.substring(i, i + 1);
            
            int size = stack.size();
            if (c.equals("("))
                stack.add(c);
            else if (stack.get(size - 1).equals("("))
                stack.set(size - 1, String.valueOf(1));
            else
                stack.set(size - 2, String.valueOf(2 * Integer.valueOf(stack.remove(size - 1))));
            
            int v = 0;
            while (stack.size() > 0 && !stack.get(stack.size() - 1).equals("("))
                v += Integer.valueOf(stack.remove(stack.size() - 1));
            if (v > 0)
                stack.add(String.valueOf(v));
        }
        
        return stack.size() > 0 ? Integer.valueOf(stack.get(0)) : 0;
    }
}