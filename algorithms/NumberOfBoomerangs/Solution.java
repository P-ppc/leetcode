class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        
        for (int[] point : points) {
            Map<Integer, Integer> distanceMap = new HashMap<Integer, Integer>();
            for (int[] p : points) {
                int distance = (int) Math.pow(point[0] - p[0], 2) + (int) Math.pow(point[1] - p[1], 2);
                if (distanceMap.get(distance) == null) {
                    distanceMap.put(distance, 1);
                } else {
                    count += 2 * distanceMap.get(distance);
                    distanceMap.put(distance, distanceMap.get(distance) + 1);
                }
            }
        }
        
        return count;
    }
}