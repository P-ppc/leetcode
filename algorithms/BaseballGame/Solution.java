class Solution {
    public int calPoints(String[] ops) {
        List<Integer> scoreStack = new ArrayList<Integer>();
        
        for (String op : ops) {
            int size = scoreStack.size();
            if (op.equals("+")) {
                scoreStack.add(scoreStack.get(size - 2) + scoreStack.get(size - 1));
            } else if (op.equals("C")) {
                scoreStack.remove(size - 1);
            } else if (op.equals("D")) {
                scoreStack.add(2 * scoreStack.get(size - 1));
            } else {
                scoreStack.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int i : scoreStack) {
            sum += i;
        }
        return sum;
    }
}