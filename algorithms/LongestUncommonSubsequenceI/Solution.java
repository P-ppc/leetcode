class Solution {
    public int findLUSlength(String a, String b) {
        int res = -1;
        if (a.length() != b.length()) res = Math.max(a.length(), b.length());
        else if (!a.equals(b)) res = a.length();
        return res;
    }
}