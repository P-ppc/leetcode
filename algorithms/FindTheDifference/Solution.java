class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        s = s + t;
        for (char c : s.toCharArray()) {
            res ^= (int) c;
        }
        return (char) res;
    }
}