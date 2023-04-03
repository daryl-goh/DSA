boolean solution(int[] a) {
       
    int len = a.length - 1; // Get the last index of the original array
    int num = 0; // Initialize a counter to track even/odd positions
    int j = 0; // Initialize an index to track even positions
    
    int b[] = new int[a.length]; // Create a new array to store the modified sequence
    
    // Iterate over the original array
    for (int i = 0; i < a.length; i++) {
        // If the counter is even, add the next even-indexed value to the new array
        if (num % 2 == 0) {
            b[i] = a[j];
            j++;
        }
        // If the counter is odd, add the next odd-indexed value to the new array
        else {
            b[i] = a[len];
            len--;
        }
        // Increment the counter
        num++;
    }
    
    // Uncomment the following line to print the modified sequence
    // System.out.println(">>>>new int array: " + Arrays.toString(b));
    
    // Check if the modified sequence is sorted using the isSorted() function
    return isSorted(b);
}

boolean isSorted(int[] b) {
    // Iterate over the sequence
    for (int i = 0; i < b.length - 1; i++) {
        // If any adjacent elements are not in ascending order, return false
        if ( b[i] >= b[i+1]) {
            return false;
        }
    }
    // If all adjacent elements are in ascending order, return true
    return true;
}