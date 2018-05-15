class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0,
            lowerCount = 0;
        for (char c : word.toCharArray()) {
            int v = (int) c;
            if (65 <= v && v <= 90) {
                if (lowerCount > 0) return false;
                upperCount += 1;
            } else {
                if (upperCount > 1) return false;
                lowerCount += 1;
            }
        }
        return true;
    }
}