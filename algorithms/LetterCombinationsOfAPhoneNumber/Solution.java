class Solution {
    private String[] digitsMap = new String[]{
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (!"".equals(digits)) backTrack(0, digits, "", res);
        return res;
    }
    
    public void backTrack(int beg, String digits, String temp, List<String> res) {
        if (beg == digits.length()) {
            res.add(temp);
        } else {
            String chars = digitsMap[digits.charAt(beg) - '0' - 2];
            for (char c : chars.toCharArray()) {
                String t = temp + String.valueOf(c);
                backTrack(beg + 1, digits, t, res);
            }
        }
    }
}