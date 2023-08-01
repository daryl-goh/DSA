def solution(arr):
    if len(arr) < 2:  # Check if the array has less than 2 elements
        return 0  # Return 0 as there are no contiguous subarrays possible with less than 2 elements

    count = 0  # Initialize the count of sawtooth contiguous subarrays to 0
    streak = 0  # Initialize the streak counter to 0, which will track flips between increasing and decreasing
    prev_increasing = None  # Initialize the variable to store the direction of the previous change (increasing or decreasing)

    for i in range(1, len(arr)):  # Loop through the array starting from index 1
        if arr[i] == arr[i-1]:  # Check if the current element is equal to the previous element
            prev_increasing = None  # Reset the previous direction as the elements are the same
            streak = 0  # Reset the streak counter to 0 as there's no flip between increasing and decreasing
        else:
            curr_increasing = arr[i] > arr[i-1]  # Check if the current element is greater than the previous element
            if curr_increasing != prev_increasing:  # Check if there's a flip in direction from the previous element
                streak += 1  # Increase the streak counter as we have a flip in direction
                prev_increasing = curr_increasing  # Update the previous direction with the current direction
            else:
                streak = 1  # Reset the streak counter to 1 when we break out of a streak of flips

            count += streak  # Add the current streak count to the total count of sawtooth contiguous subarrays

    return count  # Return the final count of sawtooth contiguous subarrays


"""
Tests passed: 16/16.
Sample tests:
8/8
Hidden tests:
8/8
Score:
500/500
"""


"""
prev_increasing is used to keep track of the direction of the previous change (increase or decrease) in the array. 
It's not just a boolean; it can have three possible values: True, False, or None.

Here's how it works:

When we encounter the first element in the array, there's no previous element to compare it with, so we initialize prev_increasing to None.
As we loop through the array, we compare the current element with the previous element (arr[i] with arr[i-1]).
If the current element is greater than the previous element (arr[i] > arr[i-1]), it means we have an increasing streak, and we set curr_increasing to True.
If the current element is less than the previous element (arr[i] < arr[i-1]), it means we have a decreasing streak, and we set curr_increasing to False.
If the current element is equal to the previous element (arr[i] == arr[i-1]), there's no flip in direction, so we set curr_increasing to None.

"""