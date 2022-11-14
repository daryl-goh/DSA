class Solution(object):
    def smallestEvenMultiple(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        
        while n > 0:
            if n % 2 == 0 and n % n == 0:
                return n
            else:
                return 2 * n