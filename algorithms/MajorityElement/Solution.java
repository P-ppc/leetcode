class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> visitedMap = new HashMap<Integer, Integer>();
        int res = 0;
        for (int num : nums) {
            if (visitedMap.get(num) == null) {
                visitedMap.put(num, 1);
            } else {
                visitedMap.put(num, visitedMap.get(num) + 1);
            }
            if (visitedMap.get(num) > nums.length / 2) {
                res = num;
                break;
            }
        }
        return res;
    }
}