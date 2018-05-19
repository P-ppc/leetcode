class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> intMap = new HashMap<Integer, Boolean>();
        for (int num : nums) {
            if (intMap.get(num) == null) {
                intMap.put(num, true);
            } else {
                return true;
            }
        }
        return false;
    }
}