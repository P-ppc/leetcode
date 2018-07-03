class Solution {
    public String longestWord(String[] words) {
        String longestWord = null;
        Map<String, Boolean> wordsMap = new HashMap<String, Boolean>();
        
        Arrays.sort(words);
        for (String word : words) {
            int length = word.length();
            if (length == 1 || wordsMap.get(word.substring(0, length - 1)) != null) {
                wordsMap.put(word, true);
                if (longestWord == null || longestWord.length() < length) {
                    longestWord = word;
                }
            }
        }
        
        return longestWord;
    }
}