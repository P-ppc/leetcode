class Solution {
    public String convertToTitle(int n) {
        String res = "";
        
        while (n > 0) {
            int mod = n % 26;
            n /= 26;
            
            if (mod == 0) {
                n--;
                mod = 26;
            }
            
            res = new String(new char[]{(char) (mod + 64)}) + res;
        }
        
        return res;
    }
}