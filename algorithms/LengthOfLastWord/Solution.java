class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0,
            prevLength = 0;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (length != 0) {
                    prevLength = length;
                }
                length = 0;
            } else {
                length++;
            }
        }
        
        return length == 0 ? prevLength : length;
    }
}