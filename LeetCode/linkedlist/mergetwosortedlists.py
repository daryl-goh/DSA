# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    # This function takes two linked lists (list1 and list2) as inputs and returns a merged linked list.
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        # We create a new ListNode called 'dummy'. This will be the starting point of our merged list.
        dummy = ListNode()
        # We set 'tail' as a reference to the 'dummy' node. It helps us keep track of where to add new nodes.
        tail = dummy

        # We start a loop. This loop will run as long as there are nodes in both list1 and list2.
        while list1 and list2:
            # We compare the values of the current nodes in list1 and list2.
            if list1.val < list2.val:
                # If the value in list1 is smaller, we connect 'tail' to the node in list1,
                # and move to the next node in list1.
                tail.next = list1
                list1 = list1.next
            else:
                # If the value in list2 is smaller or equal, we connect 'tail' to the node in list2,
                # and move to the next node in list2.
                tail.next = list2
                list2 = list2.next
            # We move 'tail' to the newly added node in the merged list.
            tail = tail.next
            
        # After the loop, we check if there are any remaining nodes in list1.
        if list1:
            # If there are, we attach the remaining nodes in list1 to the end of the merged list.
            tail.next = list1
        # If there are no remaining nodes in list1, we check if there are any in list2.
        elif list2:
            # If there are, we attach the remaining nodes in list2 to the end of the merged list.
            tail.next = list2

        # Finally, we return the merged list starting from the node after 'dummy'.
        return dummy.next
    

# Inside the Loop (tail.next = list1 or tail.next = list2):

# When we're inside the loop, we are comparing the current nodes of list1 and list2 and choosing the smaller one to add to the merged list. 
# So, the code tail.next = list1 (or tail.next = list2) within the loop only adds one specific node to the merged list, the one that's smaller. 
# This happens while we're actively comparing nodes.

# Outside the Loop (tail.next = list1 or tail.next = list2):

# Once the loop finishes, it means we have already compared and added all the smaller nodes from both list1 and list2 to the merged list. 
# However, there might be some nodes remaining in either list1 or list2 that we haven't added yet. 
# So, the code tail.next = list1 (or tail.next = list2) outside the loop is used to add the entire remaining chain of nodes to the merged list. 
# This is because the loop is done, and we're just "appending" the rest of the nodes without any further comparisons.

# In essence, the key difference is that inside the loop, we're comparing and adding one specific node at a time, whereas outside the loop, 
# we're adding the entire remaining chain of nodes without making any more comparisons.