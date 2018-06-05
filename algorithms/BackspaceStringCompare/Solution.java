class Solution {
    public boolean backspaceCompare(String S, String T) {
        List<Character> sStack = new ArrayList<Character>();
        List<Character> tStack = new ArrayList<Character>();
        
        for (char c : S.toCharArray()) {
            if (c != '#') {
                sStack.add(c);
            } else if (sStack.size() > 0) {
                sStack.remove(sStack.size() - 1);
            }
        }
        
        for (char c : T.toCharArray()) {
            if (c != '#') {
                tStack.add(c);
            } else if (tStack.size() > 0) {
                tStack.remove(tStack.size() - 1);
            }
        }
        
        char[] sArray = new char[sStack.size()];
        for (int i = 0; i < sStack.size(); i++) sArray[i] = sStack.get(i);
        
        char[] tArray = new char[tStack.size()];
        for (int i = 0; i < tStack.size(); i++) tArray[i] = tStack.get(i);
        
        return new String(sArray).equals(new String(tArray));
    }
}