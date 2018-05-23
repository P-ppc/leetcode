class Solution(object):
    def numberOfLines(self, widths, S):
        """
        :type widths: List[int]
        :type S: str
        :rtype: List[int]
        """
        lines = []
        line = ''
        line_width = 0
        for c in S:
            c_width = widths[ord(c) - ord('a')]
            if line_width + c_width > 100:
                lines.append(line)
                line = c
                line_width = c_width
            else:
                line += c
                line_width += c_width
        
        lines_count = len(lines)
        if len(line) > 0:
            lines_count += 1
        return [lines_count, line_width]