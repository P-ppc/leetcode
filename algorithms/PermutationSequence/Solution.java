class Solution {
    public String getPermutation(int n, int k) {
        String res = "";
        List<Integer> candidates = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            candidates.add(i);
        }
        k = k - 1;
        while (candidates.size() > 1) {
            n--;
            int x = factorial(n);
            int quotient = k / x;
            k = k % x;
            res += String.valueOf(candidates.get(quotient));
            candidates.remove(quotient);
        }
        res += candidates.get(0);
        return res;
    }
    
    
    public int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}