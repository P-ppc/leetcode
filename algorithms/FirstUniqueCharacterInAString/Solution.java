class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characterMap.get(c) == null) {
                characterMap.put(c, 1);
            } else {
                characterMap.put(c, characterMap.get(c) + 1);
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (characterMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}