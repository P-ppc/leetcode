class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            if (stack.size() > 0) {
                char value = stack.get(stack.size() - 1);
                if (value == '(' && c == ')') stack.remove(stack.size() - 1);
                else if (value == '[' && c == ']') stack.remove(stack.size() - 1);
                else if (value == '{' && c == '}') stack.remove(stack.size() - 1);
                else stack.add(c);
            } else {
                stack.add(c);
            }
        }
        return stack.size() == 0;
    }
}