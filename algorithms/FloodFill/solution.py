class Solution(object):
    def floodFill(self, image, sr, sc, newColor):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type newColor: int
        :rtype: List[List[int]]
        """
        filled_map = {}
        stack = [[sr, sc]]
        color = image[sr][sc]
        
        while len(stack) > 0:
            point = stack.pop()
            coordinate = str(point[0]) + 'X' + str(point[1])
            if filled_map.get(coordinate) == None:
                filled_map[coordinate] = True
            else:
                continue
            if point[0] >= 1 and image[point[0] - 1][point[1]] == color:
                stack.append([point[0] - 1, point[1]])
            if point[0] + 1 < len(image) and image[point[0] + 1][point[1]] == color:
                stack.append([point[0] + 1, point[1]])
            if point[1] >= 1 and image[point[0]][point[1] - 1] == color:
                stack.append([point[0], point[1] - 1])
            if point[1] + 1 < len(image[0]) and image[point[0]][point[1] + 1] == color:
                stack.append([point[0], point[1] + 1])
            image[point[0]][point[1]] = newColor
        return image
        