int solution(int[] a, int[] b, int k) {
    
    // initialize int count = 0
    // create a for loop
    // create left and right pointers
    // create concatenated integer
    // if concatenated integer < k, count ++
    // return count
    
    int count = 0;
    
    for(int i = 0; i < a.length; i++) {
        int left = i;
        int right = a.length - 1 - i;
    
        int concatedInt = Integer.parseInt(Integer.toString(a[left]) + Integer.toString(b[right]));
        
        if (concatedInt < k) {
            count++;
        }
    }
    return count;
}
