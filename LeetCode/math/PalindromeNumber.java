class Solution {
    public boolean isPalindrome(int x) {

        // Convert integer to string
        String convertStr = String.valueOf(x);
        // Store length of string into an Integer
        int lengthStr = convertStr.length();

        for (int i = 0; i < lengthStr/2; i++) {
            // if character at start is not equals to character at end, return false
            if (convertStr.charAt(i) != convertStr.charAt(lengthStr - i - 1)) {
                return false;
            }
        }
        return true;
    }
}