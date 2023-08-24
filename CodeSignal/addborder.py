def solution(picture):
  
    newPict = []
    # start of list
    newPict.insert(0, '*' * (len(picture[0]) + 2))
    
    for i in picture:
        newPict.append('*' + i + '*')
        
    # end of list
    newPict.append('*' * (len(picture[0]) + 2))

    return newPict