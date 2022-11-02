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
            #  r is the point where the array is divided into two subarrays
            r = len(nums)//2
            L = nums[:r]
            M = nums[r:]

            # Sort the two halves
            self.mergeSort(L)
            self.mergeSort(M)

            i = j = k = 0

            # Until we reach either end of either L or M, pick larger among
            # elements L and M and place them in the correct position at A[p..r]
            while i < len(L) and j < len(M):
                if L[i] <= M[j]:
                    nums[k] = L[i]
                    i += 1
                else:
                    nums[k] = M[j]
                    j += 1
                k += 1

            # When we run out of elements in either L or M,
            # pick up the remaining elements and put in A[p..r]
            while i < len(L):
                nums[k] = L[i]
                i += 1
                k += 1

            while j < len(M):
                nums[k] = M[j]
                j += 1
                k += 1