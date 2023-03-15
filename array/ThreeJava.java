class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> numList = new ArrayList<>();

        // Set the constraints: if nothing in nums or length of nums < 3, return empty
        // list
        if (nums == null || nums.length < 3) {
            return numList;
        }

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Set the left and right pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                // Check if the sum of the three elements is 0
                int sum = nums[i] + nums[left] + nums[right];

                // If sum == 0, add the elements to the list
                if (sum == 0) {
                    numList.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Increment left and decrement right pointers
                    left++;
                    right--;

                    // After incremtn, if the left element is the same as the previous element, increment again
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // After decrement, if the right element is the same as the previous element, decrement again
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                // If the sum is less than 0, increment left pointer (array is sorted so this will increase the sum)
                } else if (sum < 0) {
                    left++;
                // If the sum is greater than 0, decrement right pointer (array is sorted so this will decrease the sum)
                } else {
                    right--;
                }
            }
        }
        // Return the list of lists
        return numList;
    }
}