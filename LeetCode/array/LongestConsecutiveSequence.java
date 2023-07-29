/*
    O(n) solution using HashSet
 */

class Solution {
    public int longestConsecutive(int[] nums) {

        int finalcount = 0; // Variable to store the final count (length of the longest consecutive sequence)
        Set<Integer> s = new HashSet<>(); // Set to store unique elements from the array

        // Add all elements from the array to the set
        for (int i : nums) {
            s.add(i);
        }

        // Iterate through each element in the array
        for (int i : nums) {
            int prevVal = i - 1; // Previous value (to check for elements on the left side of the sequence)
            int currentLength = 1; // Current length of the sequence (starting with one element, which is the current element itself)
            int nextVal = i + 1; // Next value (to check for elements on the right side of the sequence)
       
            // Explore the left side of the sequence
            while (s.contains(prevVal)) {
                currentLength++; // Increase the sequence length
                s.remove(prevVal--); // Remove the element from the set and decrement the previous value
            }

            // Explore the right side of the sequence
            while (s.contains(nextVal)) {
                currentLength++; // Increase the sequence length
                s.remove(nextVal++); // Remove the element from the set and increment the next value
            }

            finalcount = Math.max(finalcount, currentLength); // Update the maximum length if necessary
         }

         return finalcount; // Return the length of the longest consecutive sequence
    }
}






/*
 ****************************************************************************************************************************************************************
 */






/*
    O(n log n) solution using sorting
 */


class Solution {
    public int longestConsecutive(int[] nums) {
        // Check if the input array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Initialize variables for the final count and the longest count
        int finalcount = 0;
        int longestcount = 1;

        // Sort the array in ascending order
        Arrays.sort(nums);

        // Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            // If the current number is the same as the previous number, skip to the next iteration
            if (nums[i] == nums[i-1]) {
                continue;
            }
            // If the difference between the current number and the previous number is 1, increment the longest count
            else if (nums[i] - nums[i-1] == 1) {
                longestcount++;
            }
            // If the difference is not 1, update the final count with the maximum value between the final count and the longest count,
            // and reset the longest count to 1
            else {
                finalcount = Math.max(finalcount, longestcount);
                longestcount = 1; 
            }
        }
        
        // Return the maximum value between the final count and the longest count
        return Math.max(finalcount, longestcount);
    }
}


/*
The time complexity of the provided code is O(n log n), where n represents the length of the input array nums. Here's the breakdown:

Sorting the array: The line Arrays.sort(nums) sorts the array in ascending order. 
The time complexity of the sorting algorithm used by Arrays.sort() is O(n log n), where n is the length of the array.

Iterating through the sorted array: The for loop iterates through the sorted array once, which takes O(n) time, where n is the length of the array.

Therefore, the overall time complexity is dominated by the sorting step, resulting in O(n log n) time complexity.

It's important to note that the other operations within the loop, such as comparisons and arithmetic operations, 
have constant time complexity and do not significantly affect the overall time complexity.

Keep in mind that this analysis assumes that the sorting operation is the most time-consuming step. 
If the input array is already sorted or has a small size, the actual running time might be faster.
 */