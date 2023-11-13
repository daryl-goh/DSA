# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        # Start from the root of the tree
        curr = root
        # Continue until we reach a leaf node or find the LCA
        while curr:
            # If both target nodes are smaller than the current node's value,
            # move to the left subtree
            if p.val < curr.val and q.val < curr.val:
                curr = curr.left
            # If both target nodes are greater than the current node's value,
            # move to the right subtree
            elif p.val > curr.val and q.val > curr.val:
                curr = curr.right
            # If the current node's value is between the values of p and q,
            # or equal to either p or q, then we have found the LCA
            else:
                return curr
            

"""
Binary Tree Vs Binary Search Tree:
https://www.javatpoint.com/binary-tree-vs-binary-search-tree#:~:text=A%20Binary%20search%20tree%20is,greater%20than%20the%20parent%20node.
https://courses.engr.illinois.edu/cs225/sp2022/resources/bst/#:~:text=A%20binary%20search%20tree%20(BST,these%20properties%20will%20remain%20true.

The Lowest Common Ancestor (LCA) of two nodes in a tree, typically a binary tree, is the lowest (deepest) node that has both of those nodes as descendants. 
In the context of a binary search tree (BST), the LCA is the lowest node where one target node is in the left subtree, 
and the other is in the right subtree, or the node itself is one of the targets.

In simpler terms, if you imagine the tree as a hierarchy with the root at the top, the LCA is the common "ancestor" node that is 
the lowest (in terms of position/hierarchy not in terms of value) in the tree while still being a parent to both target nodes.

        10
       /  \
      5   15
     / \    \
    3   7    18

Now, let's find the Lowest Common Ancestor (LCA) of two nodes, say 3 and 7.

Starting from the root (10), we compare the values of the target nodes (3 and 7) with the current node's value. 
We move to the left subtree because both 3 and 7 are smaller than 10. 

In the left subtree, 7 is greater than 5, so we move to the right subtree. Now, we have found that the LCA of 3 and 7 is 5.

So, in this example, the LCA of nodes 3 and 7 is 5. This is because 5 is the lowest node that is an ancestor to both 3 and 7 in the tree.
"""