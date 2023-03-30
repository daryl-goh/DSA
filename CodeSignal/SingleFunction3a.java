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