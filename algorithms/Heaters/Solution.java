class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int res = 0;
        Arrays.sort(heaters);
        
        for (int house : houses) {
            int low = 0,
                high = heaters.length - 1;
                    
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (heaters[mid] > house) {
                    high = mid - 1;
                } else if (heaters[mid] < house) {
                    low = mid + 1;
                } else {
                    low = mid;
                    break;
                }
            }
            
            int distance = 0;
            if (low == 0) {
                distance = heaters[low] - house;
            } else if (low == heaters.length) {
                distance = house - heaters[low - 1];
            } else {
                distance = Math.min(heaters[low] - house, house - heaters[low - 1]);
            }

            res = Math.max(res, distance);
        }
        
        return res;
    }
}