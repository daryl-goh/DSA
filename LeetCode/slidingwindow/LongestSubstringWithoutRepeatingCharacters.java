class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet(); // create a Set to store unique characters

        int max = 0; // initialize max length to 0
        int left = 0; // initialize left pointer to 0

        for (int right = 0; right < s.length(); right++) { // iterate through each character in the string

            while(!set.add(s.charAt(right))) { // while the current character is already in the set
                set.remove(s.charAt(left++)); // remove characters from the left of the current substring until the duplicate character is removed
            }

            max = Math.max(max, right - left + 1); // update the max length of the longest substring seen so far
        }

        return max; // return the length of the longest substring without repeating characters

    }
}