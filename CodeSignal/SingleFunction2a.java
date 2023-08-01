/*
You are given two arrays of integers a and b of the same length, and an integer k. 
We will be iterating through array a from left to right, and simultaneously through array b from right to left, 
and looking at pairs (x, y), where x is from a and y is from b. Such a pair is called tiny if the concatenation xy is strictly less than k.

Your task is to return the number of tiny pairs that you'll encounter during the simultaneous iteration through a and b.
 */

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
