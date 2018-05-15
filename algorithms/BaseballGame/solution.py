class Solution(object):
    def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """
        score_stack = []
        for op in ops:
            if op not in ['+', 'C', 'D']:
                score_stack.append(int(op))
            elif op == '+':
                score_stack.append(score_stack[-2] + score_stack[-1])
            elif op == 'C':
                score_stack = score_stack[: -1]
            elif op == 'D':
                score_stack.append(score_stack[-1] * 2)
        return sum(score_stack)