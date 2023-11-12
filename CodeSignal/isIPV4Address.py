def solution(inputString):

    l = inputString.split('.')
    
    if len(l) != 4:
        return False
    
    for i in range(len(l)):
        if not l[i].isnumeric():
            return False
        elif (len(l[i]) > 1) and (l[i][0] == '0'):
            return False
        elif int(l[i]) not in range(256):
            return False
    return True