class Solution(object):
    def buildArray(nums: List[int]) -> List[int]:
        q = len(nums)
        
        # turn the array into a=qb+r
        for i in range(len(nums)):
            r = nums[i]
            
            # retrieve correct value from potentially already processed element
            # i.e. get r from something maybe already in the form a = qb + r
            # if it isnt already processed (doesnt have qb yet), that's ok b/c
            # r < q, so r % q will return the same value
            b = nums[nums[i]] % q
            
            # put it all together
            nums[i] = q*b + r
	
        # extract just the final b values
        for i in range(len(nums)):
            nums[i] = nums[i] // q
        
        return nums

    # Below is my brute force method

    # def buildArray(self, nums):
    #     """
    #     :type nums: List[int]
    #     :rtype: List[int]
    #     """
    #     ans = []        
    #     i = 0
    #     while i < len(nums):
    #         ans.append(nums[nums[i]])
    #         i+=1
        
    #     return ans