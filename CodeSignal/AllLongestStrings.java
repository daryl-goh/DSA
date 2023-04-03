String[] solution(String[] inputArray) {
    
    int length = 0; // variable to store the maximum length found
    
    String newInputArray[] = new String[0]; // initialize output array with zero elements
    int count = 0; // variable to keep track of the number of elements added to output array
    
    // loop through input array to find maximum length
    for (int i = 0; i < inputArray.length; i++) {
        length = Math.max(length, inputArray[i].length());
    }
    
    // loop through input array to add strings with maximum length to output array
    for (int i = 0; i < inputArray.length; i++) {
       
        if (inputArray[i].length() == length) {
            // resize output array and add new element
            newInputArray = Arrays.copyOf(newInputArray, count + 1);
            newInputArray[count++] = inputArray[i];
        }
        else {
            continue;
        }
    }

    return newInputArray; // return output array with strings of maximum length
}