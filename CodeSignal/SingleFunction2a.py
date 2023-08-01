def solution(a, b, k):
    count = 0
    
    for i in range(len(a)):
        left = i
        right = len(a) - 1 - i
        
        if int(str(a[left]) + str(b[right])) < k:
            count += 1
    
    return count

"""
Tests passed: 16/16.
Sample tests:
8/8
Hidden tests:
8/8
Score:
500/500
"""