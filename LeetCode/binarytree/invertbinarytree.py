# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        # Check if the root is None (empty tree)
        if not root:
            return None
        
        # Swap the left and right subtrees of the current node
        tmp = root.left
        root.left = root.right
        root.right = tmp

        # Recursively invert the left subtree
        self.invertTree(root.left)
        # Recursively invert the right subtree
        self.invertTree(root.right)

        # Return the root of the inverted tree
        return root 
