# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        # Check if both root nodes are None, indicating an empty tree
        if not p and not q:
            return True
        # Check if one of the root nodes is None and the other is not, indicating a mismatch
        if not p or not q:
            return False
        # Check if the values of the current nodes are equal
        if p.val != q.val:
            return False
        # Recursively check the left and right subtrees
        return (self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right))