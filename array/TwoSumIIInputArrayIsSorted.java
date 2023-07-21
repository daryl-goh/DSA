class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // Initialize two pointers, 'left' and 'right', pointing to the first and last elements of the array
        int left = 0;
        int right = numbers.length - 1;
       
        // Create an array to hold the result, which will store the indices of the two numbers that add up to the target
        int[] res = new int[2];

        // Use a two-pointer approach to find the two numbers that add up to the target
        while (left < right) {

            // Calculate the sum of the elements at 'left' and 'right'
            int sum = numbers[left] + numbers[right];

            // If the sum is equal to the target, we have found the two numbers
            if (sum == target) {

                // Store the indices (1-based) of the two numbers in the 'res' array
                res[0] = left + 1;
                res[1] = right + 1;

                // Exit the loop as we have found the result
                break;
            }

            // If the sum is greater than the target, move the 'right' pointer one step to the left
            else if (sum > target) {
                right--;
            }

            // If the sum is less than the target, move the 'left' pointer one step to the right
            else {
                left++;
            }
        }

        // Return the 'res' array containing the indices of the two numbers that add up to the target
        return res;
    }
}


/*
 The solution above uses constant space, O(1), because it only declares a fixed-size array res of length 2 to store the 
 indices of the two numbers that add up to the target. 
 The size of the res array does not depend on the size of the input numbers array. 
 It remains constant regardless of the input, so the space complexity is constant. 
 Other variables like left, right, and sum also have constant space complexity since they are simple integer variables and 
 do not scale with the input size. 
 Hence, the solution uses constant space.
 */