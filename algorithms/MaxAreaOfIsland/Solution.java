class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        Map<String, Integer> dfsMap = new HashMap<String, Integer>();
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && dfsMap.get(String.valueOf(i) + "X" + String.valueOf(j)) == null) {
                    int area = 0;
                    List<Map<String, Integer>> stack = new ArrayList<Map<String, Integer>>();
                    Map<String, Integer> origin = new HashMap<String, Integer>();
                    origin.put("x", j);
                    origin.put("y", i);
                    stack.add(origin);
                    
                    while (stack.size() > 0) {
                        Map<String, Integer> point = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                        
                        int x = point.get("x"),
                            y = point.get("y");
                        
                        if (dfsMap.get(String.valueOf(y) + "X" + String.valueOf(x)) == null) {
                            area++;
                            dfsMap.put(String.valueOf(y) + "X" + String.valueOf(x), 1);
                            
                            if (y >= 1 && grid[y - 1][x] == 1) {
                                point = new HashMap<String, Integer>();
                                point.put("x", x);
                                point.put("y", y - 1);
                                stack.add(point);
                            }
                            if (y + 1 < grid.length && grid[y + 1][x] == 1) {
                                point = new HashMap<String, Integer>();
                                point.put("x", x);
                                point.put("y", y + 1);
                                stack.add(point);
                            }
                            if (x >= 1 && grid[y][x - 1] == 1) {
                                point = new HashMap<String, Integer>();
                                point.put("x", x - 1);
                                point.put("y", y);
                                stack.add(point);
                            }
                            if (x + 1 < grid[0].length && grid[y][x + 1] == 1) {
                                point = new HashMap<String, Integer>();
                                point.put("x", x + 1);
                                point.put("y", y);
                                stack.add(point);
                            }
                        }
                    }
                    
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}