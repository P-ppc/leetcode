class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0,
            zeroCount = 0,
            oneCount = 0;
        
        char lastCharacter = '*';
        
        for (char c : s.toCharArray()) {
            if (c == '0') {
                if (lastCharacter != '0') {
                    zeroCount = 1;
                } else {
                    zeroCount += 1;
                }
                if (zeroCount <= oneCount) {
                    count++;
                }
            } else if (c == '1') {
                if (lastCharacter != '1') {
                    oneCount = 1;
                } else {
                    oneCount += 1;
                }
                if (oneCount <= zeroCount) {
                    count++;
                }
            }
            lastCharacter = c;
        }
        return count;
    }
}