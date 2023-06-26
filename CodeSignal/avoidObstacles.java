int solution(int[] inputArray) {
    Arrays.sort(inputArray);
 
     // Initialize the minimum jump length to 2
     int minJump = 2;
     
     // Continue increasing the jump length until a valid jump length is found
     while (validateJumpValue(inputArray, minJump)) {
         minJump++;          
     }
     
     // Return the minimum jump length
     return minJump;
 }
 
 // Check if all the successive jumps can avoid touching obstacles  
 boolean validateJumpValue(int[] arr, int jump) {
     // Initialize the length of the successive jump
     int successiveJump = jump;
     
     // Continue increasing the successive jump length until it reaches the end of the array or touches an obstacle
     while (Arrays.binarySearch(arr, successiveJump) < 0 && successiveJump <= arr[arr.length-1]) {
         successiveJump += jump;
     }
     
     // Check if the successive jump reached the end of the array without touching an obstacle
     return successiveJump <= arr[arr.length-1];
 }


 /*

It begins by initializing a variable successiveJump with the value of jump. This represents the current position of the successive jumps.

Next, it enters a loop that continues as long as the following conditions are met:

The Arrays.binarySearch(arr, successiveJump) returns a negative value, indicating that the current position (successiveJump) is not found in the arr array. 
This means the jump doesn't touch any obstacles.
The successiveJump is less than or equal to the last element of the arr array, ensuring that it hasn't exceeded the length of the array.
Inside the loop, the successiveJump is incremented by jump on each iteration. This simulates the next jump by moving jump units forward from the current position.

Once the loop terminates, it means that either the successiveJump has reached the end of the arr array or it has touched an obstacle (found in the arr array). 
This is because the loop only continues if the conditions mentioned in step 2 are met.

Finally, the method checks if the successiveJump is less than or equal to the last element of the arr array. 
If it is, it means the loop terminated because successiveJump reached the end of the array without touching an obstacle. 
In this case, the method returns true to indicate that the jump length is valid and avoids all obstacles.

If the successiveJump exceeds the last element of the arr array, it means it touched an obstacle before reaching the end. 
In this case, the method returns false to indicate that the jump length is not valid and some obstacles are not avoidable.

The validateJumpValue method is called within the solution method to determine the minimal length of the jump needed to avoid all obstacles. 
It repeatedly increases the jump length until a valid length is found.

*/