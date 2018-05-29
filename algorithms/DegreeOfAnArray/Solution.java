class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Map<String, Integer>> numsMap = new HashMap<Integer, Map<String, Integer>>();
        List<Integer> mostNums = new ArrayList<Integer>();
        int maxCount = 0;
        int shortestLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Map<String, Integer> map;
            
            if (numsMap.get(num) == null) {
                map = new HashMap<String, Integer>();
                map.put("start", i);
                map.put("end", i);
                map.put("count", 1);
                numsMap.put(num, map);
            } else {
                map = numsMap.get(num);
                map.put("end", i);
                map.put("count", map.get("count") + 1);
                numsMap.put(num, map);
            }
            
            if (map.get("count") > maxCount) {
                maxCount = map.get("count");
                mostNums.clear();
                mostNums.add(num);
            } else if (map.get("count") == maxCount) {
                mostNums.add(num);
            }
        }
        
        for (int num : mostNums) {
            Map<String, Integer> map = numsMap.get(num);
            shortestLength = Math.min(shortestLength, map.get("end") - map.get("start") + 1);
        }
        
        return shortestLength;
    }
}