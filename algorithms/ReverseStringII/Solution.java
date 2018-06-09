class Solution {
    public String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        int i = 0,
            length = s.length();
        
        while (i < length) {
            if (i % (2 * k) == 0) {
                int start = i,
                    end = i + k - 1;
                if (end >= length) {
                    end = length - 1;
                }
                while (start < end) {
                    char temp = res[start];
                    res[start++] = res[end];
                    res[end--] = temp;
                }
                i = end + 1;
            } else {
                i++;
            }
        }
        
        return new String(res);
    }
}