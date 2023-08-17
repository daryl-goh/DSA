class Solution:
    def isValid(self, s: str) -> bool:
        # Initialize an empty stack to keep track of opening brackets
        stack = []
        # Create a dictionary mapping opening brackets to their corresponding closing brackets
        charMap = {'(': ')', '{': '}', '[': ']'}
        
        # Iterate through each character in the given string
        for char in s:
            # If the character is an opening bracket, push it onto the stack
            if char in charMap:
                stack.append(char)
            # If the character is a closing bracket
            elif not stack or charMap[stack.pop()] != char:
                # Check if the stack is empty (no matching opening bracket) or the popped opening bracket doesn't match the current closing bracket
                # If either condition is true, the arrangement is invalid
                return False
        
        # After iterating through the entire string, check if the stack is empty
        # If the stack is empty, all opening brackets were matched with their corresponding closing brackets
        # return not stack means return True if stack is empty which means that all opening brackets were matched with their corresponding closing brackets
        return not stack
    



# The time complexity of the given code is O(n), 
# where n is the length of the input string s.
# This is because the code iterates through each character of the string exactly once, 
# performing constant-time operations (pushing, popping from the stack, and dictionary lookups) for each character.

# The space complexity of the code is also O(n), 
# where n is the length of the input string. 
# In the worst case, the stack can hold all opening brackets from the input string, which would be of size n. 
# Therefore, the space used by the stack is proportional to the length of the input string.

# Overall, the code has a linear time complexity and linear space complexity with respect to the length of the input string.