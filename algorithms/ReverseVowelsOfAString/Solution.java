class Solution {
    public String reverseVowels(String s) {
        String vowelString = "aeiouAEIOU";
        char[] charArray = s.toCharArray();
        
        int start = 0,
            end = charArray.length - 1;
        while (start < end) {
            if (vowelString.indexOf(charArray[start]) != -1) {
                while (vowelString.indexOf(charArray[end]) == -1 && start < end) {
                    end--;
                }
                if (start == end) {
                    break;
                } else {
                    char temp = charArray[start];
                    charArray[start] = charArray[end];
                    charArray[end] = temp;
                    start++;
                    end--;
                }
            } else {
                start++;
            }
        }    
    
        return new String(charArray);
    }
}