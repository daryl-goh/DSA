def solution(inputString):
    res = []
    
    for i in inputString:
        if i == ")":
            tmp = ""
            while res[-1] != "(":
                tmp += res.pop()
            res.pop()
            for item in tmp:
                res.append(item)
        else:
            res.append(i)
            
    return "".join(res)