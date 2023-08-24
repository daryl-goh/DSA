def solution(a, b):
    diffList = []
    for i in range(len(a)):
        if a[i] != b[i]:
            diffList.append([a[i],b[i]])
    if len(diffList) == 0 or len(diffList) == 2 and diffList[0] == diffList[1][::-1]:
        return True
    return False