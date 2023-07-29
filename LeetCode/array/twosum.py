class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        prevMap = {}
        
        for i, n in enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i
        return
    
    
###############################################################################################################
    

# Optimal Solution
# Time complexity: O(N);
# Space Complexity: O(N);

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        # Create an empty dictionary to store the numbers and their corresponding indices
        numToIndex = {}
        
        # Loop through the list 'nums' using indices 'i'
        for i in range(len(nums)):
            # Check if the complement of the current number (target - nums[i]) is already in the dictionary
            if target - nums[i] in numToIndex:
                # If found, return the indices of the two numbers that sum up to the target
                return [numToIndex[target - nums[i]], i]
            
            # If the complement is not in the dictionary, add the current number and its index to the dictionary
            numToIndex[nums[i]] = i
        
        # If no pair is found that sums up to the target, return an empty list
        return []
   
    
###############################################################################################################


# Brute Force Solution
# Time complexity: O(N^2);
# Space Complexity: O(1);
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if (i != j and nums[i] + nums[j] == target): 
                    return [i, j]
        return []
            