class Solution(object):
    def maxMatrixSum(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: int
        """
        # `min_value` to track the smallest absolute value in the matrix
        # `total_sum` to accumulate the sum of the absolute values of all elements
        # `neg_count` to count the number of negative elements in the matrix
        min_value = float('inf')  # Start with infinity so any value in the matrix will replace it
        total_sum = 0  # To accumulate the sum of absolute values
        neg_count = 0  # To count negative numbers

        # Traverse the matrix row by row
        for row in matrix:
            for col in row:
                # If the element is negative, increment the negative count
                if col < 0:
                    neg_count += 1
                
                # Compute the absolute value of the current element
                abs_value = abs(col)
                
                # Update `min_value` to be the smallest absolute value encountered
                min_value = min(min_value, abs_value)
                
                # Add the absolute value of the current element to `total_sum`
                total_sum += abs_value

        # If the number of negative values is even, all negatives can be flipped to positives
        # In this case, return the total sum of the absolute values
        if neg_count % 2 == 0:
            return total_sum
        
        # If the number of negative values is odd, one negative must remain
        # Subtract twice the smallest absolute value to minimize the penalty
        return total_sum - (2 * min_value)