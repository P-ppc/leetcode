class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        Map<Character, Integer> patternMap = new HashMap<Character, Integer>();
        int patternLength = p.length(),
            beg = 0,
            length = 0,
            i = 0;
        
        for (char c : p.toCharArray()) {
            Integer count;
            if ((count = patternMap.get(c)) == null) patternMap.put(c, 1);
            else patternMap.put(c, count + 1);
        }
        
        Map<Character, Integer> copyPatternMap = new HashMap<Character, Integer>(patternMap);
        
        while (i < s.length()) {
            Integer count;
            if ((count = copyPatternMap.get(s.charAt(i))) == null) {
                copyPatternMap = new HashMap<Character, Integer>(patternMap);
                length = 0;
                beg = ++i;
            } else if (count > 0) {
                copyPatternMap.put(s.charAt(i), count - 1);
                length++;
                i++;
            } else {
                while (s.charAt(beg++) != s.charAt(i)) {
                    copyPatternMap.put(s.charAt(beg - 1), copyPatternMap.get(s.charAt(beg - 1)) + 1);
                    length--;
                }
                i++;
            }
            
            if (length == patternLength) {
                res.add(beg);
                copyPatternMap.put(s.charAt(beg), copyPatternMap.get(s.charAt(beg++)) + 1);
                length--;
            }
        } 
        
        return res;
    }
}