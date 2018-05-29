class Solution {
    public boolean checkRecord(String s) {
        List<Character> aStack = new ArrayList<Character>();
        List<Character> lStack = new ArrayList<Character>();
        Character lastCharacter = '0';
        
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                aStack.add(c);
            } else if (c == 'L') {
                if (lastCharacter != c) {
                    lStack.clear();
                }
                lStack.add(c);
            }
            
            if (aStack.size() > 1 || lStack.size() > 2) {
                return false;
            }
            
            lastCharacter = c;
        }
        
        return true;
    }
}