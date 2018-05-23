class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> candyKinds = new HashSet<Integer>();
        for (int candy : candies) {
            candyKinds.add(candy);
        }
        return candyKinds.size() > candies.length / 2 ? candies.length / 2 : candyKinds.size();
    }
}