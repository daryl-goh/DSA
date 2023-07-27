public class checkPalindrome {

    boolean solution(String inputString) {
        // Replace all that are not alphanumeric to "" and convert to LowerCase
        String stringFilter = inputString.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // Reverse the stringFilter
        String reverse = new StringBuffer(stringFilter).reverse().toString();
        // If they are equal, return true
        return stringFilter.equals(reverse);
    }
    
}
