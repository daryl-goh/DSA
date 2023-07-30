def solution(sequence):
    # Iterate over the indices of the sequence from 0 to the second-to-last index.
    for i in range(len(sequence) - 1):
        # Check if the current element is greater than or equal to the next element.
        if sequence[i] >= sequence[i+1]:
            # If it is not strictly increasing, create two new sequences
            # by removing the current element and the next element from the original sequence.
            sequence1 = sequence[:i] + sequence[i+1:]
            sequence2 = sequence[:i+1] + sequence[i+2:]
            # Check if either of the new sequences is strictly increasing.
            if isStrictlyIncreasing(sequence1) or isStrictlyIncreasing(sequence2):
                # If any of the new sequences is strictly increasing, return True,
                # indicating that it is possible to obtain an increasing sequence by removing a single element.
                return True
    # If no such subsequence is found after the loop, return False.
    return False


def isStrictlyIncreasing(sequence):
    # Check if the given sequence is strictly increasing.
    for i in range(len(sequence) - 1):
        # If any element is greater than or equal to the next element, return False.
        if sequence[i] >= sequence[i+1]:
            return False
    # If the loop completes without finding any non-increasing pair, return True,
    # indicating that the sequence is strictly increasing.
    return True