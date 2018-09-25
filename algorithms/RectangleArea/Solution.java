class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C - A) * (D - B) + (G - E) * (H - F),
            x1 = Math.max(A, E),
            x2 = Math.min(C, G),
            y1 = Math.max(B, F),
            y2 = Math.min(D, H);
        int intersectionArea = x2 > x1 && y2 > y1 ? (x2 - x1) * (y2 - y1) : 0;
        
        return area - intersectionArea;
    }
}