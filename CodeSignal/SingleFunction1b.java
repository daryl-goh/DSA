int solution(int[] a, int m, int k) {

    /*
     * Given an array of integers a, your task is to find how many of its contiguous subarrays of length m contain a pair of integers with a sum equal to k. 
     * More formally, given the array a, your task is to count the number of indices 0 ≤ i ≤ a.length - m such that a subarray [a[i], a[i + 1], ..., a[i + m - 1]] 
     * contains at least one pair (a[s], a[t]), where:
     * 
     * s ≠ t
     * a[s] + a[t] = k
     */
    
    // Initialize a hashmap to keep track of the frequency of each element in the window
    Map<Integer,Integer> map = new HashMap();
    // Initialize a counter for the number of contiguous subarrays of length m with product k
    int ans=0;
    // Initialize a hashset to store the products of pairs of elements that sum up to k
    Set<Long> set = new HashSet<>();
    
    // Loop through the first m elements in the array
    // and update the map and set accordingly
    for(int i=0;i<m &&i<a.length;i++){
        // If there exists an element in the window that sums up to k-a[i], add the product to set
        if(map.containsKey(k-a[i])){
            long cur = a[i]*(k-a[i]);
            if(!set.contains(cur)) set.add(cur);
        }
        // Update the frequency of the current element in the map
        if (map.containsKey(a[i])) map.put(a[i],map.get(a[i])+1);
        else map.put(a[i],1);
    }
    
    // If set contains any elements, there is at least one subarray of length m with product k
    if(set.size()>0) ans++;
    
    // Initialize a left index for the sliding window
    int le=0;
    
    // Loop through the remaining elements in the array, 
    // updating the map and set and sliding the window to the right
    for(int i=m;i<a.length;i++){
        // Decrement the frequency of the leftmost element in the window
        if(map.get(a[le])>1){
            map.put(a[le],map.get(a[le])-1);
            // If the leftmost element is part of a pair that sums up to k and its frequency is now 1,
            // remove the product from set
            if(a[le]==k-a[le] && map.get(a[le])==1){
                long cur = a[le]*(k-a[le]);
                set.remove(cur);
            }
        } 
        // If the leftmost element is not part of a pair that sums up to k, 
        // remove it from the map and set if necessary
        else {
            if(map.containsKey(k-a[le])){
                long cur = a[le]*(k-a[le]);
                set.remove(cur);
            }
            map.remove(a[le]);
        }
        // Slide the window to the right by incrementing le
        le++;
        // If there exists an element in the window that sums up to k-a[i], add the product to set
        if(map.containsKey(k-a[i])){
            long cur = a[i]*(k-a[i]);
            if(!set.contains(cur)) set.add(cur);
        }
        // If set contains any elements, there is at least one subarray of length m with product k
        if(set.size()>0) ans++;
        // Update the frequency of the current element in the map
        if (map.containsKey(a[i])) map.put(a[i],map.get(a[i])+1);
        else map.put(a[i],1);
    }
    
    // Return the counter for the number of contiguous subarrays of length m with product k
    return ans;
}
