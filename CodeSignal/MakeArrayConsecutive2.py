def solution(statues):
    count = 0
    statues.sort()
    for i in range(len(statues) - 1):
        left = i
        right = left + 1
        if statues[right] - statues[left] > 1:
            count = count + (statues[right] - statues[left] - 1)
    
    return count