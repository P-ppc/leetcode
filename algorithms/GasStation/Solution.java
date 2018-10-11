class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0,
            diffSum = 0,
            start = 0;
    
        for (int i = 0; i < gas.length; i++) {
            if (diffSum < 0) {
                diffSum = 0;
                start = i;
            }
            diffSum += gas[i] - cost[i];
            total += gas[i] - cost[i];
        }

        return total >= 0 ? start : -1;
    }
}