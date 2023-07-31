"""
Tests passed: 14/20.

Sample tests:
8/10
Hidden tests:
6/10
Score:
333/500


Failed:
Input numbers: [1, 3, 900, 10]
Expected Value: True
Return Value: False


Input numbers: [68, 105, 131, 396, 438, 754, 744, 817]
Expected Value: True
Return Value: False

"""



def solution(numbers):
    reset = 0
    
    for i in range(len(numbers) - 1):
        if numbers[i] < 10:
            numbers[i] = numbers[i]
            if not check_strictly_increasing(numbers):
                return False
        
        if 10 <= numbers[i] <= 99:
            reset = numbers[i]
            concatenated_integers = str(numbers[i] % 10) + str(abs(numbers[i] // 10))
            numbers[i] = int(concatenated_integers)
            print(">>> 2 digit numbers:", numbers)
            if numbers[i] >= numbers[i + 1]:
                return False
        
        if 100 <= numbers[i] < 1000:
            reset = numbers[i]
            concatenated_integers2 = str(numbers[i] % 10) + str((numbers[i] // 10) % 10) + str(abs(numbers[i] // 100))
            numbers[i] = int(concatenated_integers2)
            print(">>> 3 digit numbers:", numbers)
            if numbers[i] >= numbers[i + 1]:
                return False
        
        if numbers[i] == 1000:
            reset = numbers[i]
            numbers[i] = 1
            if numbers[i] >= numbers[i + 1]:
                return False
    
    return True


def check_strictly_increasing(array):
    for i in range(len(array) - 1):
        if array[i] >= array[i + 1]:
            return False
    return True