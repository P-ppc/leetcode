class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Map<String, Boolean> filledMap = new HashMap<String, Boolean>();
        List<Integer[]> stack = new ArrayList<Integer[]>();
        int color = image[sr][sc];
        
        stack.add(new Integer[]{sr, sc});
        
        while (stack.size() > 0) {
            Integer[] point = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            String coordinate = String.valueOf(point[0]) + "X" + String.valueOf(point[1]);
            
            if (filledMap.get(coordinate) == null) {
                filledMap.put(coordinate, true);
            } else {
                continue;
            }
            
            if (point[0] >= 1 && image[point[0] - 1][point[1]] == color) {
                stack.add(new Integer[]{point[0] - 1, point[1]});
            }
            if (point[0] + 1 < image.length && image[point[0] + 1][point[1]] == color) {
                stack.add(new Integer[]{point[0] + 1, point[1]});
            }
            if (point[1] >= 1 && image[point[0]][point[1] - 1] == color) {
                stack.add(new Integer[]{point[0], point[1] - 1});
            }   
            if (point[1] + 1 < image[0].length && image[point[0]][point[1] + 1] == color) {
                stack.add(new Integer[]{point[0], point[1] + 1});
            }
            image[point[0]][point[1]] = newColor;
        }
        
        return image;
    }
}