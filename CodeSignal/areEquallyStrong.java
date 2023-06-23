package CodeSignal;

boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    
    if (yourLeft == friendsLeft && yourRight == friendsRight) {
        return true;
    }
    
    if (yourLeft == friendsRight && yourRight == friendsLeft) {
        return true;
    }
    return false;
}
