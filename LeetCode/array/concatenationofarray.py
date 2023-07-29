class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        count = 1
        
        for i in range(count):
            nums.extend(nums)
            
        return nums
            