int solution(String pattern, String source) {
    // initialize int count = 0
    // create List of String to hold 0 and 1
    // initialize string array of vowels
    // iterate through source, replace vowels with 0, consonents with 1
    // iterate through the replaced numbers substring and see if pattern matches any
    // count ++ if matches
    
    // initialize int count to keep track of pattern matches
    int count = 0;
    
    // create a List of Strings to hold the 0's and 1's representing vowels and consonants
    List<String> strList = new LinkedList<>();
    
    // define a character array of vowels
    char[] vowelsArr = {'a', 'e', 'i', 'o', 'u', 'y'};
    
    // iterate through each character of the source string
    for (int i = 0; i < source.length(); i++) {
        char ch = source.charAt(i);
        
        // check if the character is a vowel
        if (Arrays.binarySearch(vowelsArr, ch) >=0) {
            strList.add("0"); // add a 0 to the list if the character is a vowel
        }
        else {
            strList.add("1"); // add a 1 to the list if the character is a consonant
        }
    }
    
    // join the List of 0's and 1's into a single String
    String joined = String.join("", strList);
    
    // iterate through all possible substrings of the joined string
    for (int i = 0; i <= joined.length() - pattern.length(); i++) {
        // if the current substring matches the given pattern, increment the count
        if (pattern.equals(joined.substring(i, i + pattern.length()))) {
            count++;
        }
    }
    
    // return the final count of pattern matches
    return count;
}
