class Solution(object):
    def spiralMatrixIII(self, R, C, r0, c0):
        """
        :type R: int
        :type C: int
        :type r0: int
        :type c0: int
        :rtype: List[List[int]]
        """
        res = []
        
        directions = [[0, 1], [1, 0], [0, -1], [-1, 0]]
        direction_index = 0
        
        max_step = 1
        cur_step = 0
        
        while len(res) < R * C:
            if 0 <= r0 < R and 0 <= c0 < C:
                res.append([r0, c0])
                
            if cur_step == max_step:
                direction_index = (direction_index + 1) % 4
            elif cur_step == max_step * 2:
                direction_index = (direction_index + 1) % 4
                max_step += 1
                cur_step = 0
            
            r0 += directions[direction_index][0]
            c0 += directions[direction_index][1]
            cur_step += 1
        
        return res