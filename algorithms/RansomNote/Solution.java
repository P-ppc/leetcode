class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            if (characterMap.get(c) == null) {
                characterMap.put(c, 1);
            } else {
                characterMap.put(c, characterMap.get(c) + 1);
            }
        }
        
        for (char c: ransomNote.toCharArray()) {
            if (characterMap.get(c) == null || characterMap.get(c) == 0) {
                return false;
            } else {
                characterMap.put(c, characterMap.get(c) - 1);
            }
        }
        return true;
    }
}