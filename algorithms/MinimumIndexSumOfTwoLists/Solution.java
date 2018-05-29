class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<String>();
        Map<String, Integer> indexMap = new HashMap<String, Integer>();
        int minIndexSum = Integer.MAX_VALUE;
        
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }
        
        for (int i = 0; i < list2.length; i++) {
            if (indexMap.get(list2[i]) != null) {
                int indexSum = indexMap.get(list2[i]) + i;
                
                if (indexSum < minIndexSum) {
                    res.clear();
                    res.add(list2[i]);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    res.add(list2[i]);
                }
            }
        }
        
        return res.toArray(new String[res.size()]);
    }
}