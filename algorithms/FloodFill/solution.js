/**
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} newColor
 * @return {number[][]}
 */
var floodFill = function(image, sr, sc, newColor) {
    let filledMap = {},
        stack = [[sr, sc]],
        color = image[sr][sc]
    
    while (stack.length > 0) {
        let point = stack.pop(),
            coordinate = `${point[0]}X${point[1]}`
        
        if (filledMap[coordinate] === undefined) {
            filledMap[coordinate] = true
        } else {
            continue
        }
        
        if (point[0] >= 1 && image[point[0] - 1][point[1]] === color) {
            stack.push([point[0] - 1, point[1]])
        }
        if (point[0] + 1 < image.length && image[point[0] + 1][point[1]] === color) {
            stack.push([point[0] + 1, point[1]])
        }
        if (point[1] >= 1 && image[point[0]][point[1] - 1] === color) {
            stack.push([point[0], point[1] - 1])
        }
        if (point[1] + 1 < image[0].length && image[point[0]][point[1] + 1] === color) {
            stack.push([point[0], point[1] + 1])
        }
        image[point[0]][point[1]] = newColor
    }
    
    return image
};