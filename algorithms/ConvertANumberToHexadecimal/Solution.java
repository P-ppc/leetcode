class Solution {
    public String toHex(int num) {
        long longNum = num;
        if (longNum == 0) {
            return "0";
        }
        
        if (longNum < 0) {
            // use 4294967295L to replace 0xffffffff
            // because 0xffffffff in java is -1
            longNum = 4294967295L + num + 1;
        }
        
        String res = "";
        
        while (longNum > 0) {
            int mod = (int) (longNum % 16);
            if (mod >= 10) {
                res = String.valueOf(((char)(mod + 87))) + res;
            } else {
                res = String.valueOf(mod) + res;
            }
            longNum = longNum / 16L;            
        }
        
        return res;
    }
}