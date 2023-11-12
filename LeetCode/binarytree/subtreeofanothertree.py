# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    # Function to check if 'subRoot' is a subtree of 'root'
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        # If 'subRoot' is None, it's considered a subtree of any tree
        if not subRoot:
            return True
        # If 'root' is None and 'subRoot' is not None, it can't be a subtree
        if not root:
            return False
        
        # Check if the current 'root' and 'subRoot' form the same tree
        if self.sameTree(root, subRoot):
            return True
        
        # Recursively check in the left and right subtrees for 'subRoot'
        return (self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot))

    # Helper function to check if two trees are the same
    def sameTree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        # If both nodes are None, they are the same
        if not root and not subRoot:
            return True
        # If one of them is None or their values are different, they are not the same
        if not root or not subRoot or root.val != subRoot.val:
            return False
        # Recursively check the left and right subtrees for equality
        return (self.sameTree(root.left, subRoot.left) and self.sameTree(root.right, subRoot.right))
