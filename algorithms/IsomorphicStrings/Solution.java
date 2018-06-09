class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<Character, Character>(),
                                  tMap = new HashMap<Character, Character>();
        
        for (int i = 0; i < s.length(); i++) {
            Character sC = s.charAt(i),
                      tC = t.charAt(i);
            
            if (sMap.get(sC) == null && tMap.get(tC) == null) {
                sMap.put(sC, tC);
                tMap.put(tC, sC);
            } else if (!sC.equals(tMap.get(tC)) || !tC.equals(sMap.get(sC))) {
                return false;
            }
        }
        
        return true;
    }
}