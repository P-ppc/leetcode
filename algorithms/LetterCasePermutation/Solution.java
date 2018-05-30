class Solution {
    public List<String> letterCasePermutation(String S) {
        Set<String> res = new HashSet<String>();
        
        for (char c : S.toCharArray()) {
            String s = String.valueOf(c);
            if (res.size() == 0) {
                res.add(s.toUpperCase());
                res.add(s.toLowerCase());
            } else {
                Set<String> temp = new HashSet<String>();
                for (String v : res) {
                    temp.add(v + s.toUpperCase());
                    temp.add(v + s.toLowerCase());
                }
                res = temp;
            }
        }
        
        res.add(S);
        
        List<String> result = new ArrayList<String>();
        result.addAll(res);
        return result;
    }
}