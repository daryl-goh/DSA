class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        # Initialize a dictionary to store the frequency of characters
        charDict = {}
        # Initialize the left pointer of the sliding window
        left = 0
        # Initialize the maximum frequency of any character in the current window
        freq = 0

        # Loop through the string using the right pointer
        for right in range(len(s)):
            # Update the frequency count of the current character in the dictionary
            charDict[s[right]] = charDict.get(s[right], 0) + 1
            # Update the maximum frequency with the maximum of the current frequency and the frequency of the current character
            freq = max(freq, charDict[s[right]])
            
            # Check if the condition for valid replacement (k replacements or fewer) is violated
            if (right - left + 1) - freq > k:
                # Reduce the frequency count of the character at the left end of the window
                charDict[s[left]] = charDict.get(s[left]) - 1
                # Move the left pointer to the right, effectively shrinking the window
                left += 1

        # Return the length of the longest valid substring
        return right - left + 1


# The time complexity of the given code is O(n), where n is the length of the input string s. 
# This is because the code iterates through the entire string once using the sliding window approach. 
# For each character, it performs constant time operations like updating the character frequency dictionary and checking conditions.

# The space complexity is O(26), which simplifies to O(1), 
# because the character frequency dictionary charDict will have at most 26 entries (one for each letter of the English alphabet). 
# Therefore, the space used by the dictionary is constant regardless of the input size. The additional space used by other variables like left, freq, and right is also constant.