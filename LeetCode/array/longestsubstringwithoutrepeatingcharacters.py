class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # Create a dictionary to store the most recent index where each character is seen
        seen = {}
        # Initialize variables to keep track of the left pointer, result, and length of current substring
        left = 0
        result = 0
        
        # Iterate through the string using the right pointer
        for right in range(len(s)):
           
            # If s[right] not in seen, we can keep increasing the window size by moving right pointer
            
            # If the current character is not seen before
            if s[right] not in seen:
                # Update the result with the maximum of the current result and the length of the current substring
                result = max(result, right - left + 1)

            
            # There are two cases if s[right] in seen:
            # case1: s[right] is inside the current window, we need to change the window by moving left pointer to seen[s[right]] + 1.
            # case2: s[right] is not inside the current window, we can keep increase the window
           

            else:
                # If the character is seen before and its last occurrence is before the left pointer
                if seen[s[right]] < left:
                    # Update the result with the maximum of the current result and the length of the current substring
                    result = max(result, right - left + 1)
                else:
                    # Move the left pointer to one position after the last occurrence of the character
                    left = seen[s[right]] + 1
            # Update the most recent index where the character is seen
            seen[s[right]] = right
        
        # Return the final result which represents the length of the longest substring without repeating characters
        return result
