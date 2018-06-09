class Solution {
    public boolean isPalindrome(String s) {
        int i = 0,
            j = s.length() - 1;
        
        while (i < j) {
            char start = s.charAt(i),
                 end = s.charAt(j);
            
            if (!(('a' <= start && start <= 'z') || ('A' <= start && start <= 'Z') || ('0' <= start && start <= '9'))) {
                i++;
            } else if (!(('a' <= end && end <= 'z') || ('A' <= end && end <= 'Z') || ('0' <= end && end <= '9'))) {
                j--;
            } else if (Character.toLowerCase(start) == Character.toLowerCase(end)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        
        return true;
    }
}