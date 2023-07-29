from asyncore import loop
from re import S


class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Use Binary Search

        # Initialize left and right pointers: Sliding Windows
        left = 0
        right = len(nums) - 1
        
        while left < right:
            mid = (left + right) // 2
            # If element in middle (5) is bigger than that in right (2), we know that the numbers have been rotated to a certain point to the right, since they are sorted.
            # e.g. [3,4,5,1,2]
            # and numbers in the left will be out of the picture.
            # this is in contrast to a list that has not be rotated, the middle element (3) will be smaller than the right element (5)
            # [1,2,3,4,5] 
            if nums[mid] > nums[right]:
                # shift let pointer to middle plus 1 since middle is out of the picture too
                left = mid + 1
            else:
                # else set right pointer to position of mid to narrow search down to left side
                right = mid
        # while loop ends when left equals or  more than right        
        return nums[left]

        # ILLUSTRATION BELOW:

        # e.g. nums = [3,4,5,1,2]

        # first loop: 
        #     left = 1, right = 4, mid = (4+1//2) = 2
        #     nums[left] = 3, nums[right] = 2, nums[mid] = 5

        #     since 5 > 2:
        #     left = 2 + 1 = 3, right = 4, mid = (3+4//2 = 3)
        #     nums[left] = 1, nums[right] = 2, nums[mid] = 1

        #  While Loop:   left < right

            
        # second loop: nums[left] = 1, nums[right] = 2, nums[mid] = 1
        #     since nums[mid] < nums[right]:
        #     right = mid = 3

        # While Loop:   left = 3, right = 3 hence break out of while loop
        # return nums[left] = 1
