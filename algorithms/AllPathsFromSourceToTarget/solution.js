/**
 * @param {number[][]} graph
 * @return {number[][]}
 */
var allPathsSourceTarget = function(graph) {
    let res = []
    if (graph.length > 0)
        backTrack(graph, 0, [], res)
    return res
};

var backTrack = function (graph, i, temp, res) {
    temp.push(i)
    if (i == graph.length - 1)
        res.push(temp)
    else
        graph[i].forEach(v => backTrack(graph, v, temp.slice(), res))
}