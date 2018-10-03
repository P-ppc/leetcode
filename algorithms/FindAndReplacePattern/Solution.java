class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int length = pattern.length();
        List<String> res = new ArrayList<String>();
        
        for (String word : words) {
            Map<Character, Character> charMap = new HashMap<Character, Character>(),
                                      charReverseMap = new HashMap<Character, Character>();
            boolean notMatch = false;
            
            for (int i = 0; i < length; i++) {
                char char1 = word.charAt(i),
                     char2 = pattern.charAt(i);
                if (charMap.get(char1) == null && charReverseMap.get(char2) == null) {
                    charMap.put(char1, char2);
                    charReverseMap.put(char2, char1);
                } else if (charMap.get(char1) == null || !charMap.get(char1).equals(char2)) {
                    notMatch = true;
                    break;
                }
            }
            
            if (!notMatch)
                res.add(word);
        }
        
        return res;
    }
}