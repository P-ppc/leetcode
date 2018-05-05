class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] checkList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> translatedSet = new HashSet<String>();
        for (String word : words) {
            String translatedStr = "";
            for (char c : word.toCharArray()) {
                translatedStr += checkList[(int) c - 97];
            }
            translatedSet.add(translatedStr);
        }
        return translatedSet.size();
    }
}