class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        for (int num : nums) {
            if (num == 1) {
                int index = res.size() - 1;
                res.set(index, res.get(index) + 1);
            } else {
                res.add(0);
            }
        }
        return Collections.max(res);
    }
}