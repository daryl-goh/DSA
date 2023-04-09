int solution(int[] inputArray) {        
    int count = 0;                      // Initialize a counter variable to keep track of increments

    for (int i = 0; i < inputArray.length - 1; i++) {    // Loop through the array until the second-to-last element

        if (inputArray[i] >= inputArray[i+1]) {          // Check if the current element is greater than or equal to the next element

            int diff = inputArray[i] - inputArray[i+1] + 1;   // Calculate the difference between the current and next elements, and add 1
            inputArray[i+1] += diff;                       // Increment the next element by the difference plus 1
            count += diff;                                 // Add the difference plus 1 to the counter variable
        }
    }
    return count;                       // Return the final count of increments
}