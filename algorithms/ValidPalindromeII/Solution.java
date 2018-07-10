class Solution {
    public boolean validPalindrome(String s) {
        int i = 0,
            j = s.length() - 1,
            markedI = 0,
            markedJ = 0;
        
        boolean leftSkip = false,
                rightSkip = false;
        
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if (!leftSkip) {
                markedI = i;
                markedJ = j;
                i++;
                leftSkip = true;
            } else if (!rightSkip) {
                i = markedI;
                j = markedJ;
                j--;
                rightSkip = true;
            } else {
                return false;
            }
        }

        return true;
    }
}