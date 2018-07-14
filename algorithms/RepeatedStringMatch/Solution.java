class Solution {
    public int repeatedStringMatch(String A, String B) {
        int lengthA = A.length(),
            lengthB = B.length(),
            i = 0,
            j = 0;
        
        int[] next = new int[lengthB];
        
        while (i < lengthB) {
            if (i == 0 || (B.charAt(i) != B.charAt(j) && j == 0)) {
                next[i] = 0;
            } else if (B.charAt(i) == B.charAt(j)) {
                next[i] = ++j;
            } else if (B.charAt(i) != B.charAt(j) && j > 0) {
                j = next[j - 1];
                continue;
            }
            i++;
        }
        
        i = j = 0;
        while (j < lengthB) {
            if (A.charAt(i % lengthA) == B.charAt(j)) {
                i++;
                j++;
            } else if (j == 0) {
                i++;
            } else if (j > 0) {
                j = next[j - 1];
            }
            
            if (i >= lengthA + lengthB) {
                return -1;
            }
        }
        
        return i % lengthA > 0 ? i / lengthA + 1 : i / lengthA;        
    }
}