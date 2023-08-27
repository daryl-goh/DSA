def solution(inputString):
    # Initialize a variable to keep track of the count of characters with odd occurrences
    res = 0
    
    # Convert the input string into a list of characters
    inputStringList = list(inputString)
    
    # Create a set of unique characters from the input string
    inputStringSet = set(inputStringList)
    
    # Iterate through the unique characters in the set
    for i in inputStringSet:
        # Increment the 'res' variable by 1 if the count of character 'i' in the list is odd
        # The count of character 'i' in the list can be obtained using the count() method
        # The count() method returns the number of times the specified element appears in the list
        # The % operator returns the remainder of the division of the count by 2
        # If the remainder is 1, the count is odd
        # If the remainder is 0, the count is even
        # The count of characters with odd occurrences is at most 1 for a string to be a palindrome
        # Therefore, the 'res' variable will be at most 1 if the string is a palindrome
        res += inputStringList.count(i) % 2
       
    # Check if the count of characters with odd occurrences is at most 1
    return res <= 1