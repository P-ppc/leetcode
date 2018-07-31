class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0,
            y = 0,
            di = 0,
            res = 0;
        
        int[] dx = {0, 1, 0, -1},
              dy = {1, 0, -1, 0};
        
        Set<String> obstacleSet = new HashSet<String>();
        
        for (int[] obstacle: obstacles) {
            obstacleSet.add(String.valueOf(obstacle[0]) + "X" + obstacle[1]);
        }
        
        for (int cmd : commands) {
            if (cmd == -2) {
                di = (di - 1) % 4;
                if (di < 0) di = di + 4;
            } else if (cmd == -1) {
                di = (di + 1) % 4;
            } else {
                for (int i = 0; i < cmd; i++) {
                    if (!obstacleSet.contains(String.valueOf(x + dx[di]) + "X" + String.valueOf(y + dy[di]))) {
                        x += dx[di];
                        y += dy[di];
                        res = Math.max(res, x * x + y * y);
                    } else {
                        break;
                    }
                } 
            }
        }
        return res;
    }
}