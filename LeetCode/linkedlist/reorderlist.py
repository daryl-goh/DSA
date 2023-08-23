# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        # find middle of list
        slow, fast = head, head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        # reverse second half of list
        second = slow.next
        prev = slow.next = None
        while second:        
            tmp = second.next
            second.next = prev
            prev = second
            second = tmp
        
        # merge two halfs of the list
        first, second = head, prev
        while second:
            tmp1, tmp2 = first.next, second.next
            first.next = second
            second.next = tmp1
            first, second = tmp1, tmp2


"""
Finding the Middle of the List:
The code starts by using two pointers, slow and fast, to find the middle of the linked list. 
The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. 
This ensures that when the fast pointer reaches the end of the list, the slow pointer will be at the middle node.

Reversing the Second Half of the List:
After finding the middle, the code identifies the second half of the linked list starting from the node after the middle node. 
It then reverses the second half of the list by manipulating the next pointers of the nodes. 
This involves updating the next pointers such that each node points to the previous node in the reversed order.

Merging the Two Halves of the List:
Once the second half of the list is reversed, the code proceeds to merge the two halves of the linked list. 
It does this by interleaving the nodes from the first half and the reversed second half. This is achieved by iteratively updating the next pointers of the nodes.

It's important to note that the code is designed to modify the input linked list in-place. 
This means that it doesn't create a new linked list as the result, but instead reorganizes the existing nodes to achieve the desired order.
"""

"""
Finding the Middle of the List:
The code starts by using two pointers, slow and fast, to find the middle of the linked list. 
The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. 
This ensures that when the fast pointer reaches the end of the list, the slow pointer will be at the middle node.

Reversing the Second Half of the List:
After finding the middle, the code identifies the second half of the linked list starting from the node after the middle node. 
It then reverses the second half of the list by manipulating the next pointers of the nodes. 
This involves updating the next pointers such that each node points to the previous node in the reversed order.

Merging the Two Halves of the List:
Once the second half of the list is reversed, the code proceeds to merge the two halves of the linked list. 
It does this by interleaving the nodes from the first half and the reversed second half. This is achieved by iteratively updating the next pointers of the nodes.

It's important to note that the code is designed to modify the input linked list in-place. 
This means that it doesn't create a new linked list as the result, but instead reorganizes the existing nodes to achieve the desired order.
"""