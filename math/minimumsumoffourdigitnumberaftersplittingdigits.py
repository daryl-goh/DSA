class Solution(object):
    def minimumSum(self, num):
        """
        :type num: int
        :rtype: int
        """
        
        digit = sorted(str(num))

        return int(digit[0] + digit[2]) + int(digit[1] + digit[3])