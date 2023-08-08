def solution(a, k):
    # Initialize a dictionary (equivalent to Java's HashMap) to store remainders and their counts
    remainder_map = {}
    count = 0
    
    for num in a:
        remainder = num % k
        complement = (k - remainder) % k  # Calculate the complement of the remainder
        
        # Check if the complement is present in the remainder_map and add its count to the result if it is
        if complement in remainder_map:
            count += remainder_map[complement]
        
        # Add the current remainder to the remainder_map with its count incremented
        remainder_map[remainder] = remainder_map.get(remainder, 0) + 1
    
    return count
