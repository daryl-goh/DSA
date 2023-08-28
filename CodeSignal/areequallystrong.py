def solution(yourLeft, yourRight, friendsLeft, friendsRight):
    if yourLeft == friendsLeft and yourRight == friendsRight or yourLeft == friendsRight and yourRight == friendsLeft:
        return True
    return False