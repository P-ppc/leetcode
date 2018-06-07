class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count = 0,
            index = 0;
        
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= g[index]) {
                count++;
                index++;

                if (index == g.length) {
                    break;
                }
            }
        }

        return count;
    }
}