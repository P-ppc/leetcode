class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        
        StringBuilder res = new StringBuilder();
        int count = 0;
        
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            
            if (c != '-') {
                if (count == K) {
                    res.insert(0, '-');
                    res.insert(0, c);
                    count = 1;
                } else if (count < K) {
                    res.insert(0, c);
                    count++;
                }
            }
        }
        
        return res.toString();
    }
}