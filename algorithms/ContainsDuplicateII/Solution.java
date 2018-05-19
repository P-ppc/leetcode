class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (intMap.get(num) == null || i - intMap.get(num) > k) {
                intMap.put(num, i);
            } else {
                return true;
            }
        }
        return false;
    }
}