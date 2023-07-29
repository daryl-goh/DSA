import java.util.HashMap;
import java.util.Map;
// 1st attempt on 16/10/2022 - 60 minutes
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null){
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }

    // 2nd attempt on 14/03/2023 - 31.25 minutes
    // class Solution {
    //     public int[] twoSum(int[] nums, int target) {
    
    //         Map<Integer, Integer> numberMap = new HashMap<>();
    //         int first = 0;
    //         int second = 0;
    
            
    
    //         // iterate through integer array
    //         for (int i=0; i<nums.length; i++) {
    //             if(numberMap.containsKey(target - nums[i])) {
    //                 // check if target minus element equals key in map
    //                 second = numberMap.get(target - nums[i]);
    //                 first = i;
    //             }
    //             else {
    //                 // store value of map and index if no
    //                 numberMap.put(nums[i], i);
    //             }
    //         }
    //         int[] newArray = new int[2];
    //         newArray[0] = first;
    //         newArray[1] = second;
    
    //         System.out.println("first: " + first);
    //         System.out.println("second: " + second);
    //         // return value of map plus index of element if yes
    //         return newArray;
    //     }
    // }




    // Brute Force Method Below:
    // public int[] twoSum(int[] nums, int target) {
        
    //     for (int i = 0; i < nums.length; i++) {
            
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    // }
}