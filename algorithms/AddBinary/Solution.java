class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int carry = 0,
            i = a.length() - 1,
            j = b.length() - 1;
        
        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? a.charAt(i) - '0' : 0,
                y = j >= 0 ? b.charAt(j) - '0' : 0,
                sum = x + y + carry;
            
            res = String.valueOf(sum % 2) + res;
            carry = sum / 2;
            i--;
            j--;
        }
        
        return carry == 1 ? "1" + res : res;
    }
}