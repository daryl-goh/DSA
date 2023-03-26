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
