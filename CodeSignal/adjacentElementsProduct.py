def solution(inputArray):
    
    return max(inputArray[i] * inputArray[i+1] for i in range(len(inputArray) - 1))