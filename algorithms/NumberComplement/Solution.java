class Solution {
    public int findComplement(int num) {
        int x = 0x01;
        while (x <= num && x >= 0) {
            num = num ^ x;
            x = x << 1;
        }
        return num;
    }
}