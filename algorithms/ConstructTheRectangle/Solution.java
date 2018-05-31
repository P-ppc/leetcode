class Solution {
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area),
            L = W;
        
        while (W > 0) {
            L = area / W;
            if (area % W == 0) {
                break;
            }
            W -= 1;
        }
        return new int[]{L, W};
    }
}