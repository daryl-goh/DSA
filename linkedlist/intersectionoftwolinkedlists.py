# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        # set a and b to start of list
        a = headA
        b = headB
        # increment a and b while they are NOT equals to each other
        while a != b:
            # if a or b reaches end of list (null), set a to headB and b to headA (beginning of opposite list)
            a = a.next if a else headB
            b = b.next if b else headA
        # when a and b are EQUAL, exit loop and return a or b (they intersected)
        return a