class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>();
        List<Integer> res = new ArrayList<Integer>();
        
        for (int num : nums1) {
            if (elementMap.get(num) == null) {
                elementMap.put(num, 1);
            } else {
                elementMap.put(num, elementMap.get(num) + 1);
            }
        }
        
        for (int num : nums2) {
            if (elementMap.get(num) != null && elementMap.get(num) > 0) {
                elementMap.put(num, elementMap.get(num) - 1);
                res.add(num);
            }
        }
        
        int[] array = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }
        return array;
    }
}