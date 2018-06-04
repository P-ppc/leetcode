class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) return false;
        
        int i = 0;
        while (i <= A.length()) {
            if (A.equals(B)) return true;
            A = A.substring(1) + A.substring(0, 1);
            i++;
        }
        
        return false;
    }
}