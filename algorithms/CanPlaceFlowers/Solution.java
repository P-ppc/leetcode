class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int pre = 0,
            count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if ((pre == 0 && flowerbed[i] == 0) && ((i + 1 < flowerbed.length && flowerbed[i + 1] == 0) || i + 1 == flowerbed.length)) {
                flowerbed[i] = 1;
                count++;
            }
            pre = flowerbed[i];
        }

        return count >= n;
    }
}