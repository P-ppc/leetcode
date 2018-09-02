class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0,
            lastTime = -1;
        
        for (int time : timeSeries) {
            res += lastTime == -1 ? 0 : Math.min(time - lastTime, duration);
            lastTime = time;
        }
        
        return res + (lastTime == -1 ? 0 : duration);
    }
}