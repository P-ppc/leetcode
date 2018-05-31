/**
 * @param {number[][]} points
 * @return {number}
 */
var numberOfBoomerangs = function(points) {
    let count = 0
    
    points.forEach(point => {
        let distanceMap = new Map()
        points.forEach(p => {
            let distance = Math.pow(point[0] - p[0], 2) + Math.pow(point[1] - p[1], 2)
            if (distanceMap.get(distance) === undefined) {
                distanceMap.set(distance, 1);
            } else {
                count += 2 * distanceMap.get(distance)
                distanceMap.set(distance, distanceMap.get(distance) + 1)
            }
        })
    })
    
    return count
};