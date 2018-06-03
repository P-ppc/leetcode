class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int index = 0;
        
        while (index < letters.length) {
            if (letters[index] > target) {
                break;
            } else {
                index++;
            }
        }
        
        if (index == letters.length) {
            index = 0;
        }
        
        return letters[index];
    }
}