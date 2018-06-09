class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<String, Character> wordsMap = new HashMap<String, Character>();
        Map<Character, String> pMap = new HashMap<Character, String>();
        
        String[] words = str.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Character p = pattern.charAt(i);
            if (wordsMap.get(word) == null && pMap.get(p) == null) {
                wordsMap.put(word, p);
                pMap.put(p, word);
            } else if (!p.equals(wordsMap.get(word)) || !word.equals(pMap.get(p))) {
                return false;
            }
        }
        
        return true;
    }
}