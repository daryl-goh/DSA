int[] solution(int[] a) {
    // initialize teamOne and teamTwo = 0
    // initialize num = 0 to keep track of even and odd indexed elements
    // create new int[] b
    // iterate through int[]a, if num is even or odd, assign element to new int[]b accordingly
    // return int[] b
    
    int teamOne = 0 ;
    int teamTwo = 0;
    
    int num = 0;
    
    int[] b = new int[2];
    
    for (int i = 0; i < a.length; i++) {
        if (num%2==0) {
            teamOne += a[i];
        }
        else {
            teamTwo += a[i];
        }
        num++;
    }
    
    b[0] = teamOne;
    b[1] = teamTwo;
    
    return b;
}
