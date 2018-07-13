class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        
        if (A.equals(B)) {
            Map<Character, Boolean> characterMap = new HashMap<Character, Boolean>();
            for (char c : A.toCharArray()) {
                if (characterMap.get(c) == null) {
                    characterMap.put(c, true);
                } else {
                    return true;
                }
            }
            return false;
        } else {
            List<Character> diffs = new ArrayList<Character>();
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    diffs.add(A.charAt(i));
                    diffs.add(B.charAt(i));
                }
            }
            if (diffs.size() == 4 && diffs.get(0) == diffs.get(3) && diffs.get(1) == diffs.get(2)) return true;
            return false;
        }
    }
}