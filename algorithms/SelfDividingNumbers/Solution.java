class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }
    
    private boolean isSelfDividingNumber(int num) {
        int originNum = num;
        while (num > 0) {
            int mod = num % 10;
            if (mod == 0 || originNum % mod != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}