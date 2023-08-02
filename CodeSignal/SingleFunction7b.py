# Define a function that adds an integer 'k' to each value in the input dictionary 'hmap'
def addToValue(hmap, k):
    for key, val in hmap.items():
        hmap[key] += k
    return hmap

# Define a function that adds an integer 'k' to each key in the input dictionary 'hmap'
def addToKey(hmap, k):
    # The keys of a dictionary are immutable, which means they cannot be modified once they are created hence we need to create a new dictionary
    newHmap = {}
    for key, val in hmap.items():
        newKey = key + k
        newHmap[newKey] = val
    return newHmap

# Define a function that processes a list of queries and returns the final answer
def solution(queryType, query):
    # Initialize a variable 'ans' to store the final result
    ans = 0
    # Initialize an empty dictionary 'hmap' to store key-value pairs
    hmap = {}
    # Initialize variables 'ck' and 'cv' to track changes in keys and values
    ck = 0
    cv = 0
    
    # Loop through the list of query types and queries
    for i in range(len(queryType)):
        # Extract the command (cmd) and the query (quer) for the current iteration
        cmd = queryType[i]
        quer = query[i]
        
        # If the command is "insert"
        if cmd == "insert":
            # Extract the key and value from the query
            key, val = quer[0], quer[1]
            # Modify the key and value based on 'ck' and 'cv'
            hmap[key - ck] = val - cv
        
        # If the command is "addToValue"
        elif cmd == "addToValue":
            # Extract the value 'k' from the query and update 'cv'
            k = quer[0]
            cv += k
        
        # If the command is "addToKey"
        elif cmd == "addToKey":
            # Extract the value 'k' from the query and update 'ck'
            k = quer[0]
            ck += k
        
        # If the command is "get"
        else:
            # Extract the value 'k' from the query and adjust 'k' based on 'ck'
            k = quer[0] - ck
            # Look up the corresponding value in 'hmap', add 'cv', and update 'ans'
            val = hmap[k] + cv
            ans = ans + val
    
    # Return the final answer
    return ans


"""
Tests passed: 30/30.
Sample tests:
15/15
Hidden tests:
15/15
Score:
500/500
"""