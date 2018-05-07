class Solution {
    public boolean hasAlternatingBits(int n) {
        int flag = -1;
        while (n > 0) {
            int res = n & 0x01;
            n >>= 1;
            if (flag == -1 || flag != res) {
                flag = res;
            } else {
                return false;
            }
        }
        return true;
    }
}