class Solution {
    public int countSegments(String s) {
        int count = 0;
        Character prev = null;
        
        for (char c : s.toCharArray()) {
            if (c == ' ' && prev != null && prev != ' ') {
                count++;
            }
            prev = c;
        }
        
        if (prev != null && prev != ' ') {
            count++;
        }
        
        return count;
    }
}