class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        summation = 0
        n = len(nums)

        # Formula to find up summation using Gauss method 
        total = n*(n+1)/2

        # Loop through nums to find total sum
        for num in nums:
            summation = num + summation
        return total - summation




        # My first attempt cleared all test cases but missed edge cases [0] and [1,2]  
        # Work on this set again
        # i, j = 0, 1
        
        # slist = sorted(nums)
        # while j < len(slist):
        #     diff = abs(slist[j] - slist[i])
        #     if diff > 1:
        #         return ((slist[i] + slist[j])/2)
        #     elif len(slist) not in slist:
        #         return len(slist)
            
        #     i += 1
        #     j += 1


