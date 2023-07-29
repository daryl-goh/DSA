class Solution {
    public boolean containsDuplicate(int[] nums) {
  
        
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = countMap.getOrDefault(nums[i], 0);
            countMap.put(nums[i], count + 1);
        }

        for (int c: countMap.values()) {
            if (c > 1) {
                return true;
            }
        }

        return false;
    }
}