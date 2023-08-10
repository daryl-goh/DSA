def solution(n):
    firstHalfList = []
    secondHalfList = []
    strN = str(n)

    for i in range(0,len(strN)):

        if i < len(strN)/2:
            firstHalfList.append(int(strN[i]))
            
        else:
            secondHalfList.append(int(strN[i]))
        
    return sum(firstHalfList) == sum(secondHalfList)