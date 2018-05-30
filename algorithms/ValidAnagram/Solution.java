class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() > t.length()) {
            String temp = s;
            s = t;
            t = temp;
        }
        
        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
        
        for (char c : s.toCharArray()) {
            if (characterMap.get(c) == null) characterMap.put(c, 1);
            else characterMap.put(c, characterMap.get(c) + 1);
        }
        
        for (char c : t.toCharArray()) {
            if (characterMap.get(c) == null || characterMap.get(c) == 0) return false;
            else characterMap.put(c, characterMap.get(c) - 1);
        }
        
        return true;
    }
}