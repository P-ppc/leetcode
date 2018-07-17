class Solution {
    public String intToRoman(int num) {
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keys = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            int temp = num / value;
            num %= value;
            while (temp-- > 0) {
                res.append(keys[i]);
            }
        }
        
        return res.toString();
    }
}