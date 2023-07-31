"""
Tests passed: 20/20.
Sample tests:
10/10
Hidden tests:
10/10
Score:
500/500
"""

def solution(a, m, k):
    count = 0
    last_pos = {}  # Create an empty dictionary to store the last positions of elements in the array
    max_complement_pos = -1  # Initialize the maximum position of the complement of an element as -1
    
    for head, num in enumerate(a, 1):  # Iterate through the array with index and element value
        tail = head - m  # Calculate the starting index of the sliding window
        
        # Deletion part is to keep space complexity O(m).
        # If this is not a concern (likely), safe to omit 
        if tail > 0 and last_pos[a[tail]] <= tail:  # Check if an element needs to be removed from the dictionary
            del last_pos[a[tail]]  # Remove the element from the dictionary if it's no longer in the sliding window
        
        # Update max_complement_pos with the maximum position of an element whose complement is in the sliding window
        max_complement_pos = max(max_complement_pos, last_pos.get(k-num, -1))
        
        # Increment count if the current sliding window meets the condition for the sum equaling k
        count += head >= m and max_complement_pos > tail
        
        # Add the current element to last_pos with its value as key and its position as value
        last_pos[num] = head
        
    return count  # Return the final count of subarrays that meet the condition
