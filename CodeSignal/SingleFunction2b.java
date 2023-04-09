/*
 * A sawtooth sequence is a sequence of numbers that alternate between increasing and decreasing. 
 * In other words, each element is either strictly greater than its neighbouring elements or strictly less than its neighbouring elements.
 * Given an array of integers arr, your task is to count the number of contiguous subarrays that represent a sawtooth sequence of at least two elements.
 */



 /*
    Tests passed: 16/16.
    Sample tests:
    8/8
    Hidden tests:
    8/8
    Score:
    500/500
  */


  long solution(int[] arr) {
    //edge case
    if (arr.length < 2)
        return 0;
    
    //initialize variables
    long counter = 0;
    int streak = 0;
    boolean prevIncreasing = false;
    
    //loop through array
    for (int i = 0; i < arr.length-1; i++) {
        //if current element is equal to next element, reset streak and prevIncreasing
        if (arr[i] == arr[i+1]){
            prevIncreasing = false;
            streak = 0;    
        } else {
            //check if current element is increasing or decreasing
            boolean currIncreasing = arr[i] < arr[i+1];
            //if there is a flip in direction, increment streak and set prevIncreasing
            if (currIncreasing != prevIncreasing){
                streak++;
                prevIncreasing = currIncreasing;
            } else {
                //otherwise, start a new streak
                streak =1;
            }
        }
        //increment counter by the value of streak
        counter += streak;
    }   
    //return the final counter value
    return counter;
}






 
 /*
  * Tests passed: 8/16. Execution time limit exceeded on test 9: Program exceeded the execution time limit. Make sure that it completes execution in a few seconds for any possible input.
    Click the "Run Tests" button to see output, console logs, and detailed error messages for sample or custom test cases. This information is hidden when clicking the "Submit" button in order to prevent hard-coding solutions to the hidden test cases.
    Sample tests:
    8/8
    Hidden tests:
    0/8
    Score:
    167/500
  */
long solution(int[] arr)  {
    long result = 0;
    for(int start = 0; start<arr.length-1; start++) {
        int end = start+1;
        while(end<arr.length && isValid(start, end, arr)) {
            result++;
            end++;
        }
    }
    return result;
}

private boolean isValid(int start, int end, int[] arr) {
    for(int i = start+1; i<=end; i++) {
        int current = arr[i], prev = arr[i-1];
        if(i == end) {
            if(current > prev || current < prev) {
                continue;
            }  else {
                return false;
            }
        } else {
            int next = arr[i+1];
            if(current > next && current > prev || current < next && current < prev) {
                continue;
            } else {
                return false;
            }
        }
    }
    return true;
}