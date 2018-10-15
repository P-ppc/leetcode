class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        for (int i = 0; i < ghosts.length; i++) {
            int[] ghost = ghosts[i];
            if (Math.abs(ghost[0] - target[0]) + Math.abs(ghost[1] - target[1]) <= Math.abs(target[0]) + Math.abs(target[1]))
                return false;
        }
    
        return true;
    }
}