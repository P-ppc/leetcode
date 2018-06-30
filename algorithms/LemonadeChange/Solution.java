class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> remains = new HashMap<Integer, Integer>();
        remains.put(5, 0);
        remains.put(10, 0);
        
        for (int bill : bills) {
            int remains_5 = remains.get(5),
                remains_10 = remains.get(10);
            
            if (bill == 5) {
                remains.put(5, remains_5 + 1);
            } else if (bill == 10) {
                if (remains_5 > 0) {
                    remains.put(5, remains_5 - 1);
                    remains.put(10, remains_10 + 1);
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (remains_10 > 0 && remains_5 > 0) {
                    remains.put(5, remains_5 - 1);
                    remains.put(10, remains_10 - 1);
                } else if (remains_5 >= 3) {
                    remains.put(5, remains_5 - 3);
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }
}