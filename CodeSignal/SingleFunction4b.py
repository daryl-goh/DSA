def solution(a):
    # Initialize count to add the number of anagrams
    count = 0
    
    # Create a dictionary to store lists as keys and their counts as values
    anagramMap = {}
    
    for num in a:
        # Create a list to store the digits of the current number
        anagramList = []
        
        # Break down the number into its digits and add them to the list
        while num > 0:
            digit = num % 10
            anagramList.append(digit)
            num //= 10
            anagramList.sort()  # Sort the list to make it anagram-friendly
            
        # Convert the list to a tuple to use it as a key in the dictionary
        anagramTuple = tuple(anagramList)
        
        if anagramTuple in anagramMap:
            count += anagramMap[anagramTuple]
            anagramMap[anagramTuple] += 1
        else:
            anagramMap[anagramTuple] = 1
    
    return count


"""
In Python, dictionary keys must be hashable, which means they need to be immutable and have a well-defined hash value. 
Lists are mutable, so they cannot be used as dictionary keys directly.

Converting the list of digits to a tuple is a way to make it hashable, as tuples are immutable and can be hashed. 
Since the elements of the list are integers and tuples of integers are hashable, using a tuple as a key allows us to uniquely 
identify different combinations of digits and store their counts in the dictionary.

For example, suppose we have a list [2, 1, 3], and we want to use it as a key in a dictionary. 
We cannot directly use the list as a key because lists are mutable. Instead, we can convert the list to a tuple (2, 1, 3), and then use this tuple as a key in the dictionary.

Converting the list to a tuple doesn't change the underlying data, and it ensures that the key is immutable and can be used in the dictionary. 
This way, we can efficiently store and retrieve values based on different combinations of digits in the list.
"""



"""
Tests passed: 31/31.
Sample tests:
16/16
Hidden tests:
15/15
Score:
500/500
"""