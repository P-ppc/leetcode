class Solution {
    public int minMoves(int[] nums) {
        int sum = 0,
            minNum = Integer.MAX_VALUE;
        for (int num : nums) {
            sum += num;
            minNum = Math.min(minNum, num);
        }
        return sum - minNum * nums.length;
    }
}