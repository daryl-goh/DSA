String solution(String inputString) {
    // create a StringBuilder object based on the input string
    StringBuilder sb = new StringBuilder(inputString);
    
    // find the last occurrence of the opening parenthesis
    int start = inputString.lastIndexOf("(");
    
    // iterate until there are no more opening parentheses found
    while (start != -1) {
        
        // find the index of the closing parenthesis
        int end = sb.indexOf(")", start);
        
        // extract the substring between the parentheses and reverse it
        String reversed = reverseString(sb.substring(start + 1, end));
        
        // replace the original substring with the reversed substring
        sb.replace(start, end + 1, reversed);
        
        // find the index of the next opening parenthesis, if any
        start = sb.lastIndexOf("(");
    }
    
    // return the final string representation of the StringBuilder object
    return sb.toString();
}
String reverseString(String inputString) {
    StringBuilder sb = new StringBuilder(inputString);
    String reversed = sb.reverse().toString();
    return reversed;
}