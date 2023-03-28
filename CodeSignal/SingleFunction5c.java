int solution(String pattern, String source) {
    int answer = 0;
    // Iterate over all possible starting indices of the pattern in the source string
    for (int startIndex = 0; startIndex <= source.length() - pattern.length(); startIndex++) {
        // Call the checkForPattern method to see if the pattern matches the substring starting at the current index
        answer += checkForPattern(pattern, source, startIndex);
    }
    return answer;
}

// Define an array of characters representing vowels
char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

public int checkForPattern(String pattern, String source, int startIndex) {
    // Iterate over each character in the pattern string
    for (int offset = 0; offset < pattern.length(); offset++) {
        char currentChar = pattern.charAt(offset);
        // If the current character is '0', check if the corresponding character in the source string is a vowel
        if (currentChar == '0') {
            if (!isVowel(source.charAt(startIndex + offset))) {
                // If the character in the source string is not a vowel, the pattern does not match, so return 0
                return 0;
            }
        } else {
            // If the current character is '1', check if the corresponding character in the source string is not a vowel
            if (isVowel(source.charAt(startIndex + offset))) {
                // If the character in the source string is a vowel, the pattern does not match, so return 0
                return 0;
            }
        }
    }
    // If all characters in the pattern match the corresponding characters in the source string, return 1 to indicate a match
    return 1;
}

public boolean isVowel(char c) {
    // Iterate over each vowel in the vowels array and check if the input character matches any of them
    for (char vowel : vowels) {
        if (vowel == c) {
            // If the character is a vowel, return true
            return true;
        }
    }
    // If the character is not a vowel, return false
    return false;
}