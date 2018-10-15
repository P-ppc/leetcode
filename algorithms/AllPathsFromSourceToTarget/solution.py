class Solution(object):
    def allPathsSourceTarget(self, graph):
        """
        :type graph: List[List[int]]
        :rtype: List[List[int]]
        """
        res = []
        if len(graph) > 0:
            self.backtrack(graph, 0, [], res)
        return res
        
    
    def backtrack(self, graph, i, temp, res):
        temp.append(i)
        if i == len(graph) - 1:
            res.append(temp)
        else:
            for v in graph[i]:
                self.backtrack(graph, v, temp[:], res)