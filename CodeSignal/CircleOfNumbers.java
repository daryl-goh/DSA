int solution(int n, int firstNumber) {
    // 0 1 2 3 4 5 6 7 8 9
    // firstnumber + n/2
    
    int[] arr = new int[n];
    
    for (int i = 0; i < n; i++) {
        arr[i] = i;
    }
    if (firstNumber < n/2) {
        return arr[firstNumber + n/2];
    }
    return arr[firstNumber - n/2];
}
