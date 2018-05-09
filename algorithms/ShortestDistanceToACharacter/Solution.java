class Solution {
    public int[] shortestToChar(String S, char C) {
        List<Integer> pos = new ArrayList<Integer>();
        int[] res = new int[S.length()];
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                pos.add(i);
            }
        }
        
        for (int i = 0; i < S.length(); i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < pos.size(); j++) {
                temp.add(Math.abs(i - pos.get(j)));
            }
            res[i] = Collections.min(temp);
        }
        return res;
    }
}