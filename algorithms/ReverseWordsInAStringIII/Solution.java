class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        List<String> reversedWords = new ArrayList<String>();
        for (String word : words) {
            reversedWords.add(new StringBuilder(word).reverse().toString());
        }
        return String.join(" ", reversedWords.toArray(new String[reversedWords.size()]));
    }
}