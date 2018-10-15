class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (graph.length > 0)
            backTrack(graph, 0, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void backTrack(int[][] graph, int i, List<Integer> temp, List<List<Integer>> res) {
        temp.add(i);
        if (i == graph.length - 1)
            res.add(temp);
        else {
            for (int v : graph[i])
                backTrack(graph, v, new ArrayList<Integer>(temp), res);
        }
    }
}