class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        List<String> words = new ArrayList<String>();
        String res = null;
        int maxCount = 0;
        
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[!?',;.]", "");
        
        for (int i = 0; i < banned.length; i++) {
            banned[i] = banned[i].toLowerCase();
        }
        
        for (String word : paragraph.split(" ")) {
            if (wordsMap.get(word) == null) {
                wordsMap.put(word, 1);
                words.add(word);
            } else {
                wordsMap.put(word, wordsMap.get(word) + 1);
            }
        }
        
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (!Arrays.asList(banned).contains(word) && wordsMap.get(word) > maxCount) {
                res = word;
                maxCount = wordsMap.get(word);
            }
        }
        
        return res;
    }
}