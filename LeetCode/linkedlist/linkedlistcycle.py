# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # Defining a method named hasCycle that takes a ListNode as input and returns a boolean
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        # Initializing two pointers 'slow' and 'fast' to the head of the linked list
        slow, fast = head, head
        
        # Using a while loop to iterate as long as 'fast' and 'fast.next' are not None
        while fast and fast.next:
            # Moving the 'slow' pointer one step forward
            slow = slow.next
            # Moving the 'fast' pointer two steps forward
            fast = fast.next.next
            
            # Checking if 'slow' and 'fast' pointers have met, indicating a cycle
            if slow == fast:
                return True  # If a cycle is detected, return True
        
        # If the loop completes without finding a cycle, return False
        return False
    

"""
Time Complexity:
The code uses the slow and fast pointer technique to detect the presence of a cycle in a linked list. 
In the worst case, if there is no cycle, the fast pointer will traverse the entire linked list until it reaches the end. 
Therefore, the time complexity of this algorithm is O(n), where n is the number of nodes in the linked list.

Space Complexity:
The code uses a constant amount of extra space for the 'slow' and 'fast' pointers, regardless of the size of the linked list. 
Hence, the space complexity is O(1), indicating constant space usage.
"""