class Solution(object):
    def sortArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        self.mergeSort(nums)
        return nums

    def mergeSort(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if len(nums) > 1:
            #  mid is the point where the array is divided into two subarrays
            mid = len(nums)//2
            left = nums[:mid]
            right = nums[mid:]

            # Sort the two halves (need to call this recursively so that left and right are sorted independently
            # before the while-if-else loop starts to add the elements back together as we will be
            # comparing the element's size which will not work if left and right are not sorted)
            self.mergeSort(left)
            self.mergeSort(right)
            # i is pointer for left, j is pointer for right, k is pointer for nums
            i = j = k = 0

            # Until we reach either end of either left or right, pick the larger of the
            # elements in left and right and place them in the correct position at nums[k]
            while i < len(left) and j < len(right):
                # Choosing the lower of the two elements
                if left[i] <= right[j]:
                    # If left[i] is lower, assign it to nums[k]
                    nums[k] = left[i]
                    # Increase pointer for left while keeping pointer for right still
                    i += 1
                else:
                    # If right[i] is lower, assign it to nums[k]
                    nums[k] = right[j]
                    # Increase pointer for right while keeping pointer for left still
                    j += 1
                # Increase pointer for nums
                k += 1
            # Notice above while comparison is AND. Below is OR.
            # We will eventually run of elements at the end of the loop except for the last element
            # Do the same comparison individually.
            while i < len(left):
                nums[k] = left[i]
                i += 1
                k += 1

            while j < len(right):
                nums[k] = right[j]
                j += 1
                k += 1