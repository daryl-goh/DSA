# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        # Initialize prev pointer as null
        prev = None
        # Initialize curr pointer as the head
        curr = head
        # Run a loop till curr points to NULL
        while curr:
            # Initialize next pointer as next pointer of curr
            next = curr.next
            # Assign the prev pointer to curr's next pointer (REVERSE IT)
            curr.next = prev
            # Move prev to curr
            prev = curr
            # Move curr to next
            curr = next
            # Repeat process till curr points to null
        # Return prev (prev will be pointing to head of reverse linked)
        return prev 