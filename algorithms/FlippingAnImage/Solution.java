class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            int length = row.length;
            for (int i = 0; i < length; i++) {
                row[i] ^= 1;
            }
            
            int start = 0,
                end = length - 1;
            while (start < end) {
                row[start] = row[start] + row[end];
                row[end] = row[start] - row[end];
                row[start] = row[start] - row[end];
                start++;
                end--;
            }
        }
        return A;
    }
}