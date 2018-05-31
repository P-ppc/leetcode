class Solution(object):
    def numberOfBoomerangs(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        count = 0
        
        for point in points:
            distance_map = {}
            for p in points:
                distance = pow(point[0] - p[0], 2) + pow(point[1] - p[1], 2)
                if distance_map.get(distance) == None:
                    distance_map[distance] = 1
                else:
                    count += 2 * distance_map[distance]
                    distance_map[distance] += 1
        
        return count