class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length(),
            j = -1;
        int[] next = new int[length];
        next[0] = -1;
        
        for (int i = 1; i < length; i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            next[i] = j;
        }
        
        int subLength = length - 1 - next[length - 1];
        return subLength != length && length % subLength == 0;
    }
}