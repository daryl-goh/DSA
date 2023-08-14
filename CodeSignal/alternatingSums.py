def solution(a):
    team1 = []
    team2 = []
    
    res = []
    
    for i in range(len(a)):
        if i%2 != 0:
            team2.append(a[i])
            
        else:
            team1.append(a[i])
    
    res = sum(team1), sum(team2)
    
    return res