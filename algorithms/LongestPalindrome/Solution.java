class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> appearedMap = new HashMap<Character, Integer>();
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (appearedMap.get(c) == null) {
                appearedMap.put(c, 1);
            } else {
                count += 2;
                appearedMap.remove(c);
            }
        }
        
        if (s.length() > count) {
            count++;
        }
        
        return count;
    }
}