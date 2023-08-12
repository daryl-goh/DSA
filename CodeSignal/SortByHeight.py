def solution(a):
    for i in range(len(a)):
        if a[i] == -1:
            continue
        for j in range(len(a)):
            if a[i] < a[j]:
                a[i], a[j] = a[j], a[i]
 
    return a