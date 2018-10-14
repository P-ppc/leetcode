class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] res = new int[length];
        LinkedList<Map<String, Integer>> stack = new LinkedList<Map<String, Integer>>();
        
        for (int i = 0; i < length; i++) {
            while (stack.size() > 0 && stack.peek().get("value") < temperatures[i]) {
                Map<String, Integer> e = stack.pop();
                res[e.get("index")] = i - e.get("index");
            }
            Map<String, Integer> e = new HashMap<String, Integer>();
            e.put("index", i);
            e.put("value", temperatures[i]);
            stack.push(e);
        }
        
        return res;
    }
}