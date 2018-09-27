class Solution(object):
    def countBattleships(self, board):
        """
        :type board: List[List[str]]
        :rtype: int
        """
        count = 0
        for i in xrange(len(board)):
            for j in xrange(len(board[0])):
                if board[i][j] == 'X' and (board[i - 1][j] if i > 0 else '.') == '.' and (board[i][j - 1] if j > 0 else '.') == '.':
                    count += 1
                
        return count