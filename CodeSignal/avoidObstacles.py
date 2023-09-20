def solution(inputArray):
    i = 1
    while any(num % i == 0 for num in inputArray):
        i += 1
    return i