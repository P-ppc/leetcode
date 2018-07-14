class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) return 9;
        int upper = (int) Math.pow(10,n) - 1;
        for (int i = upper; i > upper / 10; i--) {
            StringBuffer str = new StringBuffer();
            str.append(i);
            long palin = Long.valueOf(str.toString() + str.reverse().toString());
            for (int j = upper; j > upper / 10; j--) {
                if (palin / j > upper)
                    break;
                if (palin % j == 0)
                    return (int) (palin % 1337);
            }
        }
        return -1;        
    }
}