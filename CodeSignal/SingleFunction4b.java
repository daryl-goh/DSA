/*
 * Given an array of integers a, your task is to count the number of pairs i and j (where 0 ≤ i < j < a.length), such that a[i] and a[j] are digit anagrams.
 * Two integers are considered to be digit anagrams if they contain the same digits. In other words, 
 * one can be obtained from the other by rearranging the digits (or trivially, if the numbers are equal). 
 * For example, 54275 and 45572 are digit anagrams, but 321 and 782 are not (since they don't contain the same digits). 
 * 220 and 22 are also not considered as digit anagrams, since they don't even have the same number of digits.
 */


 /*
    Tests passed: 30/30.
    Sample tests:
    15/15
    Hidden tests:
    15/15
    Score:
    500/500
  */

 long solution(int[] a) {
    // Initialize long count = 0 to add number of anagrams
    // Create Map to do checks
    // Create list and add broken down elements into list
    // Check if map contains list
    // Put list into map as key 
    // If map contains list, add 1 to count
    // Return count
    
    long count = 0;
    
    Map <List<Integer>, Integer> anagramMap = new HashMap<>();
    
    for (int i=0; i<a.length; i++) {
        List<Integer> anagramList = new LinkedList<>();
        
        while (a[i] > 0) {
            int num = a[i] % 10;
            anagramList.add(num);
            a[i] /= 10;
            Collections.sort(anagramList);
            // System.out.println(">>> List: " + anagramList);
        }
        
        
        if (anagramMap.containsKey(anagramList)) {
            count += anagramMap.get(anagramList);
            anagramMap.put(anagramList, anagramMap.get(anagramList) + 1);
        }
        
        else anagramMap.put(anagramList, 1);
        
    }
    
    return count;
 
 
    
}
