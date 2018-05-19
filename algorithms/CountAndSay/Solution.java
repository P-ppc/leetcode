class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
            String stack = "";
            String temp = "";
            for (int j = 0; j < res.length(); j++) {
                String c = res.substring(j, j + 1);
                if (stack.length() > 0 && !stack.substring(stack.length() - 1).equals(c)) {
                    temp += stack.length() + stack.substring(stack.length() - 1);
                    stack = c;
                } else {
                    stack += c;
                }
            }
            if (stack.length() > 0) {
                temp += stack.length() + stack.substring(stack.length() - 1);
            }
            res = temp;
        }
        return res;
    }
}