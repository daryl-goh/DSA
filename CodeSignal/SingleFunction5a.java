/*
 * Given an array of integers a, your task is to calculate the digits that occur the most number of times in the array. Return the array of these digits in ascending order.
 */

 /*
    Tests passed: 22/22.
    Sample tests:
    11/11
    Hidden tests:
    11/11
    Score:
    500/500
 */

 
 int[] solution(int[] a) {
    
    // Step 1: Create a Map to store frequency counts
        Map<Integer, Integer> digitCount = new HashMap<>();
        
        // Step 2: Iterate through the array and update frequency counts
        for (int num : a) {
            while (num != 0) {
                int digit = num % 10;
                digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
                num /= 10;
            }
        }
        
        // Step 3: Find maximum frequency count
        int maxCount = 0;
        for (int count : digitCount.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        // Step 4: Create a new ArrayList to store digits with max frequency
        List<Integer> digitsWithMaxCount = new ArrayList<>();
        
        // Step 5: Iterate through the Map and add digits to the ArrayList
        for (Map.Entry<Integer, Integer> entry : digitCount.entrySet()) {
            if (entry.getValue() == maxCount) {
                digitsWithMaxCount.add(entry.getKey());
            }
        }
        
        // Step 6: Convert ArrayList to array and sort in ascending order
        int[] result = new int[digitsWithMaxCount.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = digitsWithMaxCount.get(i);
        }
        Arrays.sort(result);
        
        // Step 7: Return the result
        return result;
}