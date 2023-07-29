public int[] productExceptSelf(int[] nums) {
    // Create an array to store the resulting products
    int[] result = new int[nums.length];

    // Calculate the product of all elements to the left of each index
    for (int i = 0, tmp = 1; i < nums.length; i++) {
        result[i] = tmp;  // Store the product calculated so far
        tmp *= nums[i];  // Update the product by multiplying with the current element
    }

    // Calculate the product of all elements to the right of each index
    for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
        result[i] *= tmp;  // Multiply the previously calculated product with the product to the right
        tmp *= nums[i];   // Update the product by multiplying with the current element
    }

    // Return the resulting product array
    return result;
}


/*
Suppose we have the input array nums = [1, 2, 3, 4]. We'll go step-by-step through the code to see how it calculates the product of all elements except self.

Initialize the result array: result = [0, 0, 0, 0].

First loop:

i = 0: We start at index 0. Set result[0] = 1 (initial value of tmp), and update tmp = 1 * 1 = 1.
i = 1: Move to index 1. Set result[1] = 1 (previous value of tmp), and update tmp = 1 * 2 = 2.
i = 2: Move to index 2. Set result[2] = 2 (previous value of tmp), and update tmp = 2 * 3 = 6.
i = 3: Move to index 3. Set result[3] = 6 (previous value of tmp), and update tmp = 6 * 4 = 24.
After the first loop, the result array becomes: result = [1, 1, 2, 6].

Second loop:

i = 3: Start at index 3 (the rightmost element). Set tmp = 1 (initial value).
Multiply result[3] by tmp: result[3] *= 1, so result[3] = 6 * 1 = 6.
Update tmp = 1 * 4 = 4.
i = 2: Move to index 2. Multiply result[2] by tmp: result[2] *= 4, so result[2] = 2 * 4 = 8. Update tmp = 4 * 3 = 12.
i = 1: Move to index 1. Multiply result[1] by tmp: result[1] *= 12, so result[1] = 1 * 12 = 12. Update tmp = 12 * 2 = 24.
i = 0: Move to index 0. Multiply result[0] by tmp: result[0] *= 24, so result[0] = 1 * 24 = 24.
After the second loop, the result array becomes: result = [24, 12, 8, 6].

Return the result array: [24, 12, 8, 6].

The resulting array represents the product of all elements in the input array [1, 2, 3, 4] except for the element at each index. 
So, in this case, the code calculates [2*3*4, 1*3*4, 1*2*4, 1*2*3] = [24, 12, 8, 6].

This approach avoids using division and achieves the desired result in linear time complexity.


The reason for having two loops in the productExceptSelf method is to calculate the product of all elements except self for each element in the input array.

The first loop is responsible for calculating the product of all elements to the left of each element. 
It iterates through the array from left to right and keeps track of the running product in the tmp variable. 
At each iteration, it stores the current running product (tmp) in the corresponding index of the result array and updates tmp by multiplying it with the current element. 
This way, after the first loop, each element in the result array holds the product of all elements to the left of itself.

The second loop is responsible for calculating the product of all elements to the right of each element. 
It starts from the rightmost element and follows a similar approach as the first loop but in reverse. 
It multiplies the current element in the result array by the running product (tmp), which represents the product of all elements to the right of the current element. 
After each multiplication, it updates tmp by multiplying it with the current element. 
This way, after the second loop, each element in the result array holds the product of all elements to the left and right of itself, excluding itself.

By having these two loops, we effectively calculate the product of all elements except self for each element in the input array and store the results in the result array.
 */