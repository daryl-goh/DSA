def solution(inputArray):
    res = 0
    left = 0
    while left < len(inputArray) - 1:
        right = left + 1
        if abs(inputArray[right] - inputArray[left]) > res:
            res = abs(inputArray[right] - inputArray[left])
            print("res", res)
        left += 1
        
    return res