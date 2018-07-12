class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;
    
        int radical = (int) Math.sqrt(c),
            beg = 0;

        while (beg <= radical) {
            int temp = beg * beg + radical * radical;
            if (temp == c) {
                return true;
            } else if (temp > c) {
                radical--;
            } else {
                beg++;
            }
        }

        return false;
    }
}