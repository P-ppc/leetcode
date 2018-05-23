class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        String line = "";
        int lineWidth = 0;
        int lineCount = 0;
        
        for (char c : S.toCharArray()) {
            int cWidth = widths[(int) c - 97];
            if (lineWidth + cWidth > 100) {
                lineCount++;
                line = String.valueOf(c);
                lineWidth = cWidth;
            } else {
                line += String.valueOf(c);
                lineWidth += cWidth;
            }
        }
        
        return new int[]{line.length() > 0 ? lineCount + 1 : lineCount, lineWidth};
    }
}