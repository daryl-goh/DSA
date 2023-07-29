class Solution {
    public int[] getConcatenation(int[] nums) {
        // initialize new integer array with twice the length of nums
        int[] newNums = new int[nums.length*2];

        // iterate through nums and assign to newNums[nums.length + i] and newNums[i] accordingly.
        for (int i = 0; i < nums.length; i++) {
            newNums[nums.length + i] = newNums[i] = nums[i];
        }
        return newNums;
    }
}