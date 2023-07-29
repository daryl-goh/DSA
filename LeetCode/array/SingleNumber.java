class Solution {
    public int singleNumber(int[] nums) {
        // sort array
        Arrays.sort(nums);
        
        // iterate through array by 2
        for (int i = 0; i < nums.length-1; i+=2) {
            // if current element is not equal to next element, return current element
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        
        }
        // if no single number found, return last element
        return nums[nums.length-1];

    }
}