class Solution {
    public String toLowerCase(String str) {
        StringBuilder res = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            res.append((char) ('A' <= c && 'Z' >= c ? c + 32 : c));
        }
        
        return res.toString();
    }
}