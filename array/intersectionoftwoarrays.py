class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # Change the Lists to Sets
        hashset1 = set(nums1)
        hashset2 = set(nums2)
        # Use '&' to find intersection of Sets and convert back to List
        return list(hashset1 & hashset2)