class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        List<Integer> array = new ArrayList<Integer>();
        List<Integer> reverseArray = new ArrayList<Integer>();
        
        while (x > 0) {
            int mod = x % 10;
            x = x / 10;
            array.add(mod);
            reverseArray.add(0, mod);
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != reverseArray.get(i)) return false;
        }
        return true;
    }
}