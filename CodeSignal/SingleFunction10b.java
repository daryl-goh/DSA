// Only passed 8/8 test cases did not pass results as exceeded time limit.



/**
 * This method counts the number of valid subarrays in the given array.
 *
 * @param arr the array to search for valid subarrays
 * @return the number of valid subarrays
 */
long solution(int[] arr)  {
    long result = 0;

    // Iterate over all possible subarrays (pairs of indices).
    for (int start = 0; start < arr.length - 1; start++) {
        int end = start + 1;

        // Expand the subarray to the right as long as it remains valid.
        while (end < arr.length && isValid(start, end, arr)) {
            result++;
            end++;
        }
    }

    return result;
}

/**
 * This method checks whether a subarray of the given array is valid.
 *
 * A subarray is valid if it is either strictly increasing or strictly decreasing.
 *
 * @param start the starting index of the subarray
 * @param end the ending index of the subarray
 * @param arr the array containing the subarray
 * @return true if the subarray is valid, false otherwise
 */
private boolean isValid(int start, int end, int[] arr) {
    // Iterate over all adjacent pairs of elements in the subarray.
    for (int i = start + 1; i <= end; i++) {
        int current = arr[i], prev = arr[i - 1];

        // If this is the last pair of elements in the subarray, check whether
        // they are equal or strictly increasing or strictly decreasing.
        if (i == end) {
            if (current > prev || current < prev) {
                continue;  // subarray is still valid
            } else {
                return false;  // subarray is not valid
            }
        } else {
            int next = arr[i + 1];

            // If this is not the last pair of elements in the subarray, check
            // whether the current element is strictly greater or less than
            // both the previous and the next elements.
            if (current > next && current > prev || current < next && current < prev) {
                continue;  // subarray is still valid
            } else {
                return false;  // subarray is not valid
            }
        }
    }

    // If all pairs of elements are strictly increasing or strictly decreasing,
    // then the subarray is valid.
    return true;
}