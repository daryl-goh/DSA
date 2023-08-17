class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        // Check constraints: if nums is null or has less than 3 elements, return empty list
        if (nums == null || nums.length < 3) {
            return res;
        }

        // Sort the array in ascending order
        Arrays.sort(nums);

        int main = 0;

        // Iterate through the array with the main pointer
        while (main < nums.length - 2) {
            // Break the loop if the current main element is greater than 0 (refer to comments at bottom)
            if (nums[main] > 0) {
                break;
            }

            // Set the left and right pointers
            int low = main + 1;
            int high = nums.length - 1;

            // Start the two-pointer traversal
            while (low < high) {
                long sum = (long) (nums[main] + nums[low] + nums[high]);

                // If the sum of the three elements is equal to 0, add them to the result list
                if (sum == 0) {
                    res.add(Arrays.asList(nums[main], nums[low], nums[high]));
                }

                // If the sum is less than or equal to 0, increment the low pointer (you need a larger sum)
                if (sum <= 0) {
                    // Skip duplicate elements
                    while (low + 1 < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    low++;
                }

                // If the sum is greater than or equal to 0, decrement the high pointer (you need a smaller sum)
                if (sum >= 0) {
                    // Skip duplicate elements
                    while (low < high - 1 && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    high--;
                }
            }

            // Move the main pointer to the next non-duplicate element
            while (main + 1 < nums.length - 2 && nums[main] == nums[main + 1]) {
                main++;
            }
            main++;
        }
        return res;
    }
}



/*
 * 
The code block if (nums[main] > 0) { break; } in line 19 is used to optimize the algorithm by skipping unnecessary iterations. 
Since the array nums is sorted in ascending order, if the value of the main element is already greater than 0, it means that all the remaining elements in the array will also be greater than 0.

In the context of the threeSum problem, the goal is to find triplets that sum up to zero. 
If the main element is greater than 0, it implies that there cannot be any triplets that sum up to zero since adding positive numbers will not result in a sum of zero.

Therefore, breaking out of the loop when nums[main] > 0 saves unnecessary iterations and improves the efficiency of the algorithm, especially when the array contains mostly positive numbers. 
It avoids unnecessary computations for cases where there are no valid triplets, making the algorithm more efficient.
 */