int solution(String s1, String s2) {
    
    // Initialize a counter to keep track of the number of common characters
    int count = 0;
    
    // Create a map to store the characters in the first string and their frequency
    Map<Character, Integer> charMap = new HashMap<>();
    
    // Convert the strings to character arrays
    char[] ch1 = s1.toCharArray();
    char[] ch2 = s2.toCharArray();
    
    // Loop through the characters in the first string
    for (int i = 0; i < ch1.length; i++) {
        
        // Check if the character is already in the map
        if (charMap.containsKey(ch1[i])) {
            // If it is, increment the frequency
            charMap.put(ch1[i], charMap.get(ch1[i]) + 1);
        }
        else {
            // If it's not, add it to the map with a frequency of 1
            charMap.put(ch1[i], 1);
        }
    }
    
    // Loop through the characters in the second string
    for (int i=0; i < ch2.length  ; i++){
        // Check if the character is in the map and its frequency is greater than or equal to 1
        if (charMap.containsKey(ch2[i]) && charMap.get(ch2[i]) >= 1) {
            // If it is, decrement its frequency and increment the counter
            charMap.put(ch2[i], charMap.get(ch2[i]) - 1);
            count ++;
        }
    }

    // Return the number of common characters
    return count;
}