class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        # Define a recursive helper function named dfs for depth-first search
        def dfs(root):
            # Base case: if the current node is None (empty), return True and height 0
            if not root:
                return [True, 0]

            # Recursive calls to dfs for the left and right subtrees
            left, right = dfs(root.left), dfs(root.right)

            # Check if the current subtree is balanced by comparing heights and checking balance condition
            balanced = left[0] and right[0] and abs(left[1] - right[1]) <= 1

            # Return a list containing the result of balance check and the height of the current subtree
            return [balanced, 1 + max(left[1], right[1])]

        # Call the dfs function on the root of the tree and return the result of the balance check
        # return the boolean hence [0] in dfs(root)
        return dfs(root)[0]
