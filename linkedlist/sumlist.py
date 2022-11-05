# class Node:
#   def __init__(self, val):
#     self.val = val
#     self.next = None

def sum_list(head):
  total = 0
  current = head  
  while current is not None:
    total += current.val
    current = current.next
    
  return total
