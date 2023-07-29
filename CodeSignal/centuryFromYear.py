def solution(year):
    if (year % 100 != 0): 
        return int((year/100) + 1)
    
    return int((year/100))