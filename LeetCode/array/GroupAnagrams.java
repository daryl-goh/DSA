class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Check if input array is null or empty
        if (strs == null || strs.length == 0) {
            return new ArrayList<>(); // Return an empty list
        }

        // Create a HashMap to store the groups of anagrams
        Map<String, List<String>> anaMap = new HashMap<>();

        // Iterate through each string in the input array
        for (String s : strs) {
            // Convert the string to a character array
            char[] ch = s.toCharArray();
            // Sort the character array in ascending order
            Arrays.sort(ch);
            // Convert the sorted character array back to a string
            String keyStr = String.valueOf(ch);
            
            // Check if the HashMap already contains the key
            if (!anaMap.containsKey(keyStr)) {
                // If the key is not present, add a new entry with the key and an empty list as the value
                anaMap.put(keyStr, new ArrayList<>());
            }
            // Add the current string to the list associated with the key
            anaMap.get(keyStr).add(s);
        }

        // Create a new list containing the values of the HashMap (lists of anagrams)
        return new ArrayList<>(anaMap.values());
    }
}