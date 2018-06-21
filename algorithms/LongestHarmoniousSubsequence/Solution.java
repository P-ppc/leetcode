class Solution {
    public int findLHS(int[] nums) {
        int maxLength = 0;
        Map<String, Map<String, Object>> harmoniousMap = new HashMap<String, Map<String, Object>>();
        
        for (int num : nums) {
            String prevKey = String.valueOf(num - 1) + "X" + String.valueOf(num),
                   nextKey = String.valueOf(num) + "X" + String.valueOf(num + 1);
            
            if (harmoniousMap.get(prevKey) == null) {
                Map<String, Object> m = new HashMap<String, Object>();
                m.put("length", 1);
                m.put("base", num);
                m.put("isHarmonious", false);
                harmoniousMap.put(prevKey, m);
            } else {
                Map<String, Object> m = harmoniousMap.get(prevKey);
                m.put("length", (Integer) m.get("length") + 1);
                if (!((Integer) m.get("base")).equals(num)) {
                    m.put("isHarmonious", true);
                }
                if ((Boolean) m.get("isHarmonious")) {
                    maxLength = Math.max(maxLength, (Integer) m.get("length"));
                }
            }
            
            if (harmoniousMap.get(nextKey) == null) {
                Map<String, Object> m = new HashMap<String, Object>();
                m.put("length", 1);
                m.put("base", num);
                m.put("isHarmonious", false);
                harmoniousMap.put(nextKey, m);
            } else {
                Map<String, Object> m = harmoniousMap.get(nextKey);
                m.put("length", (Integer) m.get("length") + 1);
                if (!((Integer) m.get("base")).equals(num)) {
                    m.put("isHarmonious", true);
                }
                if ((Boolean) m.get("isHarmonious")) {
                    maxLength = Math.max(maxLength, (Integer) m.get("length"));
                }
            }
        }
        
        return maxLength;
    }
}