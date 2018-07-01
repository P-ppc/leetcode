class Solution {
    public List<String> readBinaryWatch(int num) {
        Map<Integer, String[]> hoursMap = new HashMap<Integer, String[]>(),
                                minsMap = new HashMap<Integer, String[]>();
        
        hoursMap.put(0, new String[]{"0"});
        hoursMap.put(1, new String[]{"1", "2", "4", "8"});
        hoursMap.put(2, new String[]{"3", "5", "9", "6", "10"});
        hoursMap.put(3, new String[]{"7", "11"});
        
        minsMap.put(0, new String[]{"00"});
        minsMap.put(1, new String[]{"01", "02", "04", "08", "16", "32"});
        minsMap.put(2, new String[]{"03", "05", "09", "17", "33", "06", "10", "18", "34", "12", "20", "36", "24", "40", "48"});
        minsMap.put(3, new String[]{"07", "11", "19", "35", "13", "21", "37", "25", "41", "49", "14", "22", "38", "26", "42", "50", "28", "44", "52", "56"});
        minsMap.put(4, new String[]{"15", "23", "39", "27", "43", "51", "29", "45", "53", "57", "30", "46", "54", "58"});
        minsMap.put(5, new String[]{"31", "47", "55", "59"});
        
        List<String> res = new ArrayList<String>();
        
        for (int i = 0; i < 4; i++) {
            if (minsMap.get(num - i) != null) {
                for (String hour : hoursMap.get(i)) {
                    for (String min : minsMap.get(num - i)) {
                        res.add(hour + ":" + min);
                    }
                } 
            }
        }
        
        return res;
    }
}