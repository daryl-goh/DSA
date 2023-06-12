class Solution {
    public String sortSentence(String s) {
        // Split the input string into an array of words
        String[] words = s.split(" ");

        // Create a new array to store the final sorted words
        String[] finalResult = new String[words.length];

        // Iterate over each word in the input string
        for (String word : words) {
            // Get the index of the last character in the word
            int i = word.length() - 1;

            // Assign the word (excluding the last character) to the correct position in the finalResult array
            finalResult[word.charAt(i) - '1'] = word.substring(0, i);
        }

        // Join the sorted words into a string using a space as the separator
        return String.join(" ", finalResult);
    }
}