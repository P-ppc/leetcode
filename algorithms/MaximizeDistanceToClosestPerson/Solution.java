class Solution {
    public int maxDistToClosest(int[] seats) {
        int start = 0,
            end = 0, 
            maxDistance = 0,
            length = seats.length;
        
        for (int i = 0; i < length; i++) {
            int seat = seats[i];
            if (seat == 1) {
                if (start == 0 || end == length - 1) {
                    maxDistance = Math.max(maxDistance, end - start + 1);
                } else {
                    maxDistance = Math.max(maxDistance, (end - start + 1) / 2 + (end - start + 1) % 2);
                }
                if (i + 1 < length) {
                    start = end = i + 1;
                }
            } else {
                end = i;
            }
        }
        
        if (start == 0 || end == length - 1) {
            maxDistance = Math.max(maxDistance, end - start + 1);
        } else {
            maxDistance = Math.max(maxDistance, (end - start + 1) / 2 + (end - start + 1) % 2);
        }
        
        return maxDistance;
    }
}