def solution(a, k):
    # Initialize the left and right pointers for binary search
    left, right = 0, max(a)
    
    while(left < right):
        # Calculate the mid point for the current binary search iteration
        mid = (left + right + 1) // 2
        
        # Initialize the sum of ribbons for this iteration
        total_ribbons = 0
        
        # Calculate the total number of ribbons that can be cut with the current mid length
        for ribbon_length in a:
            total_ribbons += ribbon_length // mid
            
        # Compare the total ribbons with the required number of ribbons (k)
        if total_ribbons >= k:
            # If the total ribbons are greater than or equal to k, update the left pointer
            left = mid
        else:
            # If the total ribbons are less than k, update the right pointer
            right = mid - 1
    
    # Check if there's a valid ribbon length found
    if left != 0:
        return left  # Return the maximum ribbon length to obtain at least k ribbons
        
    return -1  # If no valid ribbon length is found