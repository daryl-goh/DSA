# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        cur = head
        while cur:
            while cur.next and cur.next.val == cur.val:
                cur.next = cur.next.next # skip duplicated node
            cur = cur.next # not duplicated node, skip to next node
        return head

        # Why must assign cur = head?
        # Because if you operate with head directly, you will lost the pointer point at the head 
        # after running the while loop.
        # Therefore, we set another pointer cur = head and we can return the left linked list 
        # with pointer head, which hasn't been changed during the while loop. 
        