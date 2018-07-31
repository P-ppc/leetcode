/**
 * @param {number[]} commands
 * @param {number[][]} obstacles
 * @return {number}
 */
var robotSim = function(commands, obstacles) {
    let x = y = di = res = 0,
        dx = [0, 1, 0, -1],
        dy = [1, 0, -1, 0]
        obstacleSet = new Set(obstacles.map(d => `${d[0]}X${d[1]}`))
    
    commands.forEach(cmd => {
        if (cmd === -2) {
            di = (di - 1) % 4
            if (di < 0) di = di + 4
        } else if (cmd === -1) {
            di = (di + 1) % 4
        } else {
            for (let i = 0; i < cmd; i++) {
                if (!obstacleSet.has(`${x + dx[di]}X${y + dy[di]}`)) {
                    x += dx[di]
                    y += dy[di]
                    res = Math.max(res, x * x + y * y)
                } else {
                    break
                }
            }            
        }
    })
    
    return res
};