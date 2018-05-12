class Solution {
    public int romanToInt(String s) {
        int res = 0;
        String stack = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        for (char c : s.toCharArray()) {
            stack += Character.toString(c);
            if (stack.length() == 2 && map.get(stack) != null) {
                res += map.get(stack);
                stack = "";
            } else if (stack.length() == 2) {
                res += map.get(stack.substring(0, 1));
                stack = stack.substring(1, 2);
            }
        }
        if (map.get(stack) != null) {
            res += map.get(stack);
        }
        return res;
    }
}