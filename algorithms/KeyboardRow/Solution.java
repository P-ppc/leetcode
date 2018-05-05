class Solution {
    public String[] findWords(String[] words) {
        int[] primeList = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
        long firstLineProduct = 1L;
        long secondLineProduct = 1L;
        long lastLineProduct = 1L;
        for(char c : "qwertyuiop".toCharArray()) {
            firstLineProduct *= primeList[(int) c - (int) 'a'];
        }
        for(char c : "asdfghjkl".toCharArray()) {
            secondLineProduct *= primeList[(int) c - (int) 'a'];
        }
        for(char c : "zxcvbnm".toCharArray()) {
            lastLineProduct *= primeList[(int) c - (int) 'a'];
        }
        List<String> result = new ArrayList<String>();
        
        for (String word : words) {
            String unduplicatedWord = "";
            for (String c : word.toLowerCase().split("")) {
                if (!unduplicatedWord.contains(c)) {
                    unduplicatedWord += c;
                }
            }
            long product = 1L;
            for(char c : unduplicatedWord.toCharArray()) {
                product *= primeList[(int) c - (int) 'a'];
            }
            
            if (firstLineProduct % product == 0 || secondLineProduct % product == 0 || lastLineProduct % product == 0) {
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);  
    }
}