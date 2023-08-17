class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # Create an empty set to store unique characters in the current substring
        charSet = set()
        # Initialize the left pointer, which represents the start of the current substring
        left = 0
        # Initialize a variable to store the result, which is the length of the longest substring
        res = 0

        # Iterate through the string using the right pointer
        for right in range(len(s)):
            # Check if the current character is already in the charSet (indicating a repeating character)
            while s[right] in charSet:
                # Remove the leftmost character from the set and move the left pointer forward
                charSet.remove(s[left])
                left += 1
            # Add the current character to the charSet, as it is part of the current non-repeating substring
            charSet.add(s[right])
            # Update the result with the maximum of the current result and the length of the current substring
            res = max(res, right - left + 1)

        # Return the final result, which represents the length of the longest substring without repeating characters
        return res



# Time Complexity: O(n)

# The code iterates through the input string s exactly once, where n is the length of the string.
# The inner while loop runs in constant time for each character, but it doesn't result in nested iterations over the entire input string.

# Space Complexity: O(min(n, m))

# In the worst case, the charSet set can contain all characters of the string s without repeating any character. 
# This happens when there are no repeating characters in the entire string.
# The space complexity is limited by the size of the set, which is min(n, m) 
# where n is the length of the string and m is the number of unique characters in the input alphabet (e.g., 26 for lowercase English letters).
# In most practical cases, where the input alphabet size is constant (e.g., lowercase English letters), the space complexity can be considered as O(1).

# Overall, this code provides an efficient solution for finding the length of the longest substring without repeating characters, 
# as it operates in linear time complexity and uses a bounded amount of additional space.

##############################################################################################################################################################################




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



# Time Complexity: O(n)

# The code iterates through the input string s exactly once, where n is the length of the string.
# Inside the loop, each operation (dictionary lookup, addition, comparison, etc.) takes constant time.

# Space Complexity: O(min(n, m))

# The space complexity is determined by the size of the seen dictionary and the variables used to keep track of indices and the result.
# In the worst case, when there are no repeating characters in the entire string, the dictionary can have at most m unique characters, where m is the size of the character set.
# The space complexity can be considered as O(1) when the input alphabet size is constant (e.g., lowercase English letters).
# Overall, this code provides an efficient solution for finding the length of the longest substring without repeating characters, 
# as it operates in linear time complexity and uses a bounded amount of additional space.