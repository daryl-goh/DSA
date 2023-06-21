class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert input strings to char arrays
        char[] sCh = s.toCharArray();
        char[] tCh = t.toCharArray();
        // Sort the char arrays in ascending order
        Arrays.sort(sCh);
        Arrays.sort(tCh);
        // Convert sorted char arrays back to strings
        String sStr = new String(sCh);
        String tStr = new String(tCh);
        // Check if the sorted strings are equal
        if (sStr.equals(tStr)) {
            return true; // Strings are anagrams
        }
        return false; // Strings are not anagrams
    }
}