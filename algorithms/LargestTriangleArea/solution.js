/**
 * @param {number[][]} points
 * @return {number}
 */
var largestTriangleArea = function(points) {
    let maxArea = 0
    points.forEach(point1 => {
        points.forEach(point2 => {
            points.forEach(point3 => {
                let a = point1[0],
                    b = point1[1],
                    c = point2[0],
                    d = point2[1],
                    e = point3[0],
                    f = point3[1]
                
                maxArea = Math.max(maxArea, Math.abs(a * d + b * e + c * f - a * f - b * c - d * e) / 2)
            })
        })        
    })
    return maxArea
};