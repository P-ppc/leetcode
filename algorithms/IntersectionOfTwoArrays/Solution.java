class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> nums1Map = new HashMap<Integer, Boolean>();
        List<Integer> resList = new ArrayList<Integer>();
        
        for (int num : nums1) {
            if (nums1Map.get(num) == null) {
                nums1Map.put(num, true);
            }
        }
        
        for (int num : nums2) {
            if (nums1Map.get(num) != null) {
                nums1Map.put(num, null);
                resList.add(num);
            }
        }
        
        int[] res = new int[resList.size()];
        
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        
        return res;
    }
}