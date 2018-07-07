class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        if (needleLength == 0) return 0;
        
        int i = 0, j = 0;
        List<Integer> next = new ArrayList<Integer>();
        
        while (i < needleLength) {
            if (i == 0 || (needle.charAt(i) != needle.charAt(j) && j == 0)) {
                next.add(0);
            } else if (needle.charAt(i) == needle.charAt(j)) {
                next.add(j + 1);
                j++;
            } else if (needle.charAt(i) != needle.charAt(j)) {
                j = next.get(j - 1);
                continue;
            }
            i++;
        }
        
        i = j = 0;
        
        while (i < haystack.length() && j < needleLength) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else if (j == 0) {
                i++;
            } else {
                j = next.get(j - 1);
            }
        }
        
        return j == needleLength ? i - j : -1;
    }
}