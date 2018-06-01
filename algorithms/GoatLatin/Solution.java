class Solution {
    public String toGoatLatin(String S) {
        String vowels = "aeiouAEIOU";
        String[] words = S.split(" ");
        String res = "";
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (res.length() != 0) {
                res += " ";
            }
            
            if (!vowels.contains(word.substring(0, 1))) {
                word = word.substring(1) + word.substring(0, 1);
            }
            
            word += "ma";
            for (int j = 0; j <= i; j++) {
                word += "a";
            }
            
            res += word;
        }
        return res;
    }
}