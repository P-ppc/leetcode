class Solution {
    public String addStrings(String num1, String num2) {
        String res = "";
        int carry = 0,
            i = num1.length() - 1,
            j = num2.length() - 1;
        
        while (i >= 0 || j >= 0) {
            int a = i >= 0 ? num1.charAt(i) - '0' : 0,
                b = j >= 0 ? num2.charAt(j) - '0' : 0,
                sum = a + b + carry;
            
            res = String.valueOf(sum % 10) + res;
            carry = sum / 10;
            i--;
            j--;
        }
        
        return carry == 1 ? "1" + res : res;
    }
}