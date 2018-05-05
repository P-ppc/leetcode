class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        String[] stones = S.split("");
        for (String stone : stones) {
            if (J.contains(stone)) {
                count++;
            }
        }
        return count;
    }
}