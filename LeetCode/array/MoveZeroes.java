public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        // iterate through the array
        for (int i=0; i<nums.length; i++) {
            // if the current element is 0, then swap it with the next non-zero element
            if (nums[i] == 0) {
                for (int j=i+1; j<nums.length; j++) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
            // if the current element is not 0, then move on to the next element
        }
        // if the current element is 0, then swap it with the next non-zero element

       


        
    }
    
}
