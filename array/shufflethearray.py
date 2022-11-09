class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        nums2 = []
        
        for i in range(n):
           
            nums2 += [nums[i]]
            nums2 += [nums[i + n]]
            
        return nums2
        