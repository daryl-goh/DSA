boolean solution(String inputString) {
    // Create a HashMap to store character count.
    Map<Character, Integer> countMap = new HashMap<>();
    // Initialize a counter for the number of characters with an odd count.
    int oddCounter = 0;

    // Loop through each character in the input string.
    for (char c: inputString.toCharArray()) { 
        // Increment the count of the current character in the HashMap.
        countMap.put(c, countMap.getOrDefault(c, 0) + 1);
    }
    
    // Loop through each character count in the HashMap.
    for (Character c: countMap.keySet()) {
        // Check if the current character count is odd.
        if ((countMap.get(c) % 2 == 1)) {
            // Increment the odd counter.
            oddCounter++;
            
            // If there are more than one character with an odd count, return false.
            if (oddCounter == 2) {
                return false;
            }
        }
    }
    // If there is at most one character with an odd count, return true.
    return true;
}