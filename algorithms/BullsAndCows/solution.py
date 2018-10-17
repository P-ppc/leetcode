class Solution(object):
    def getHint(self, secret, guess):
        """
        :type secret: str
        :type guess: str
        :rtype: str
        """
        bull_count = 0
        cow_count = 0
        value_map = {}
        guess_remains = []
        
        for i in xrange(len(secret)):
            if secret[i] == guess[i]:
                bull_count += 1
            else:
                value_map[secret[i]] = 1 if value_map.get(secret[i]) == None else value_map.get(secret[i]) + 1
                guess_remains.append(guess[i])
                
        for v in guess_remains:
            if value_map.get(v) != None and value_map.get(v) > 0:
                cow_count += 1
                value_map[v] -= 1
                
        return '%dA%dB' % (bull_count, cow_count)