/*
 * Given two strings s and t, both consisting of lowercase English letters and digits, 
 * your task is to calculate how many ways exactly one digit could be removed from one of the strings so that s is 
 * lexicographically smaller than t after the removal. Note that we are removing only a single instance of a single digit, 
 * rather than all instances (eg: removing 1 from the string a11b1c could result in a1b1c or a11bc, but not abc).
 * Also note that digits are considered lexicographically smaller than letters.
 */


 /*
    Tests passed: 15/15.
    Sample tests:
    8/8
    Hidden tests:
    7/7
    Score:
    500/500
  */


int solution(String s, String t) {
    
    // instantiate int count = 0
    
    // create 2 for loops, 1 for s and 1 for t
    // create StringBuilder and check for digits
    // if there is a digit, remove from StringBuilder
    // compare s to t using compareTo method and increment count
    
    int count = 0;
    
    for (int i = 0; i < s.length(); i++) {
        StringBuilder sStringBuilder = new StringBuilder(s);
        if (Character.isDigit(s.charAt(i))) {
            sStringBuilder.deleteCharAt(i);
        
        String sString = sStringBuilder.toString();
        if (sString.compareTo(t) < 0) {
            count++;
        }
        }
    }
    
    for (int j = 0; j < t.length(); j++) {
        StringBuilder tStringBuilder = new StringBuilder(t);
        if (Character.isDigit(t.charAt(j))) {
            tStringBuilder.deleteCharAt(j);
        
        String tString = tStringBuilder.toString();
        if (s.compareTo(tString) < 0) {
            count++;
        }
        }
    }
    return count;
    
}