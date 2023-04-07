/*
 * You are given an array of non-negative integers numbers. 
 * You are allowed to choose any number from this array and swap any two digits in it. 
 * If after the swap operation the number contains leading zeros, 
 * they can be omitted and not considered (eg: 010 will be considered just 10).
 * Your task is to check whether it is possible to apply the swap operation at most once, 
 * so that the elements of the resulting array are strictly increasing.
 */

/*
Tests passed: 16/20.

Sample tests:
8/10
Hidden tests:
8/10
Score:
400/500
 */

boolean solution(int[] numbers) {
    int n = numbers.length;

    for (int i = 0; i < n - 1; i++) {
        if (numbers[i] >= numbers[i+1]) {
            if (swapDigits(numbers, i)) {
                break;
            } else {
                return false;
            }
        }
    }
    
    return true;
}

boolean swapDigits(int[] numbers, int i) {
    int n = numbers[i];
    int m = numbers[i+1];
    
    // swap every possible pair of digits
    for (int j = 0; j < 3; j++) {
        for (int k = j+1; k < 3; k++) {
            int new_n = n % 10;
            int new_m = m % 10;
            n /= 10;
            m /= 10;
            if (n * 100 + new_m * 10 + new_n < m * 100 + new_n * 10 + new_m) {
                // update the numbers array with the modified number
                numbers[i] = n * 100 + new_m * 10 + new_n;
                // check if the array is strictly increasing with the modified number
                if (isStrictlyIncreasing(numbers)) {
                    return true;
                }
                // undo the modification
                numbers[i] = n * 100 + new_n * 10 + new_m;
            }
        }
    }
    
    return false;
}

boolean isStrictlyIncreasing(int[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] >= numbers[i+1]) {
            return false;
        }
    }
    
    return true;
}