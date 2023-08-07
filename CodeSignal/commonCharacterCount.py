def solution(s1, s2):
    count = 0                  # Initialize a variable 'count' to keep track of the common character count.
    commonLetter = set(s1) & set(s2)  # Create a set 'commonLetter' by performing 'and' operation on sets 's1' and 's2'.
                                     

    for i in commonLetter:     # Loop through each common character in the 'commonLetter' set.
        count += min(s1.count(i), s2.count(i))  # Find the minimum count of character 'i' in strings 's1' and 's2'
                                               # and add it to the 'count' variable.

    return count               # Return the final count of common characters between 's1' and 's2'.
