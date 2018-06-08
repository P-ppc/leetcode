    class Solution {
    public String convertToBase7(int num) {
        String res = "";
        boolean isNegative = false;
        
        if (num == 0) {
            res = "0";
        } else {
            if (num < 0) {
                num = -num;
                isNegative = true;
            }
            
            while (num > 0) {
                res = String.valueOf(num % 7) + res;
                num /= 7;
            }
        }
        
        return isNegative ? "-" + res : res;
    }
}