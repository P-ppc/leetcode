class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = a & b; //carry
            a ^= b; //add 
            b = c << 1;
        }
        return a;
    }
}