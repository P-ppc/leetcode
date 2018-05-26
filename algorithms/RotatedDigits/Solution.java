import java.util.regex.Pattern;

class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        
        for (int i = 0; i <= N; i++) {
            if (!Pattern.matches(".*[347].*", String.valueOf(i)) && Pattern.matches(".*[2569].*", String.valueOf(i))) count++;    
        }
        
        return count;
    }
}