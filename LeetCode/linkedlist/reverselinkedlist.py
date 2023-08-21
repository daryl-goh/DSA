# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        # Iterative process using 2 pointers
        # Initialize prev pointer as null
        prev = None
        # Initialize curr pointer as the head
        curr = head
        # while curr is not null (Run a loop till curr points to NULL)
        while curr:
            # Initialize a temporary variable nxt to store curr's next pointer
            # This is done because we are going to change curr's next pointer
            # and we will lose the next node so we store it in nxt
            nxt = curr.next
            # Assign the prev pointer to curr's next pointer (REVERSE IT)
            # This is done because we are reversing the linked list
            curr.next = prev
            # Move prev to curr
            prev = curr
            # Move curr to next
            curr = nxt
            # Repeat process till curr points to null
        # Return prev (prev will be pointing to head of reverse linked)
        return prev 