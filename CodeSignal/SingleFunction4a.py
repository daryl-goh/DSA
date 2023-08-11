"""
Tests passed: 19/20.

Sample tests:
9/10
Hidden tests:
10/10
Score:
483/500

"""



def solution(numbers):
    # Initialize a boolean flag to track if a flaw is encountered
    flaw = False
    
    # Iterate through the list of numbers
    for i in range(len(numbers)-1):
        # Check if the current number is greater than or equal to the next number
        if numbers[i] >= numbers[i+1]:
            # Check if a flaw was already encountered before, if yes, return False
            if flaw:
                return False
            else:
                # Mark a flaw and remember the index where it occurred
                flaw = True
                flawIndex = i

    # If no flaw was encountered, the list is already strictly increasing
    if not flaw:
        return True

    # Calculate the swapped numbers
    a = swap(numbers[flawIndex])
    b = swap(numbers[flawIndex+1]) if flawIndex < len(numbers)-1 else None

    # Simplified return statement by calculating conditions directly
    return (
        (flawIndex != 0 or a > numbers[flawIndex]) and a < numbers[flawIndex+1]
    ) or (
        b < numbers[flawIndex] and (flawIndex < len(numbers)-1 or b < numbers[flawIndex+1])
    )

def swap(num):
    sn = str(num)
    l, r = max(sn), min(sn)
    # Find indices of the largest and smallest digits
    largeIndex = sn.index(l)
    smallIndex = sn.rindex(r)
    # Swap the digits at the found indices
    res = "".join([sn[largeIndex] if i == smallIndex else sn[smallIndex] if i == largeIndex else sn[i] for i in range(len(sn))])

    return int(res)