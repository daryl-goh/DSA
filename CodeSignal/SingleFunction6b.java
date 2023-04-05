long solution(int[] a, int k) {
    
    /*
     * In this solution, we iterate over the input array and calculate the remainder of each integer when divided by k. 
     * We then calculate the complement of the remainder, which is the remainder that would make the sum of two integers divisible by k.
     * We check if the complement is present in the HashMap and add its count to the result if it is. 
     * Finally, we add the current remainder to the HashMap with its count incremented.
     */
    
    Map<Integer, Integer> remainderMap = new HashMap<>();
    long count = 0;
    for (int num : a) {
        int remainder = num % k;
        int complement = (k - remainder) % k; //  calculate the complement of the remainder, which is the remainder that would make the sum of two integers divisible by k
        if (remainderMap.containsKey(complement)) {
            count += remainderMap.get(complement); //  calculate the complement of the remainder, which is the remainder that would make the sum of two integers divisible by k
        }
        // Add the current remainder to the remainderMap with its count incremented
        remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
    }
    return count;
    



    /* Brute Force Method Below Got Score of 300/500 Only
     * ERROR: Program exceeded the execution time limit. Make sure that it completes execution in a few seconds for any possible input.
     */
    // long count = 0;
    
    // for (int i = 0; i < a.length - 1; i++) {
    //     for (int j = i + 1; j < a.length; j++) {
            
    //         if ((a[i] + a[j])%k == 0) {
    //             count++;
    //         }
    //     }
    // }
    // return count;
}
