# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        # Check if the root is None (empty tree)
        if not root:
            return 0

        # Calculate the depth of the tree as 1 plus the maximum depth of its left and right subtrees
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
