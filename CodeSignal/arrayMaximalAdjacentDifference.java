int solution(int[] inputArray) {
    
    int maxDiff = 0;
    
    for (int i = 0; i < inputArray.length - 1; i++) {
        maxDiff = Math.max(Math.abs(inputArray[i] - inputArray[i+1]), maxDiff);
    }
    
    return maxDiff;
}
