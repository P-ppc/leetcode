class Solution {
    public int minAddToMakeValid(String S) {
        LinkedList<Character> stack = new LinkedList<Character>();
        
        for (char c : S.toCharArray()) {
            if (c == ')' && stack.size() > 0 && stack.peek().equals('('))
                stack.pop();
            else
                stack.push(c);
        }
        
        return stack.size();
    }
}