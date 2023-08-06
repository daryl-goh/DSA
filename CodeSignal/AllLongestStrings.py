def solution(inputArray):
    
    newInputArray = []
    
    maxLength = len(max(inputArray, key=len))

    for i in range(len(inputArray)):
        if len(inputArray[i]) == maxLength:
            newInputArray.append(inputArray[i])
            
    return newInputArray