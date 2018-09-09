class Solution {
    public int countArrangement(int N) {
        int[] res = new int[]{0};
        List<Integer> candidates = new ArrayList<Integer>();
        for (int i = 1; i <= N; i++) {
            candidates.add(i);
        }
        backTrack(candidates, 0, res);
        return res[0];
    }
    
    public void backTrack(List<Integer> candidates, int i, int[] res) {
        int size = candidates.size();
        if (size == 0) {
            res[0]++;
        } else {
            i++;
            for (int j = 0; j < size; j++) {
                int c = candidates.get(j);
                if (c % i == 0 || i % c == 0) {
                    List<Integer> tempCandidates = new ArrayList<Integer>(candidates);
                    tempCandidates.remove(j);
                    backTrack(tempCandidates, i, res);
                }
            }
        }
    }
}