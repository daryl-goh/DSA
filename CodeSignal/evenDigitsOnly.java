boolean solution(int n) {
    
    // Initialize variables to track evenness and store single digit
    boolean isEven = false;
    int singleDigit = 0;
    
    // Loop through the digits of the input number
    while (n > 0) {
        // Extract the last digit of the number
        singleDigit = n % 10;
        
        // Check if the digit is even
        if (singleDigit % 2 == 0) {
            isEven = true;
        }
        // If the digit is odd, set isEven to false and break the loop
        else {
            isEven = false;
            break;
        }
        
        // Remove the last digit from the number
        n = n / 10;
    }
    
    // Return the final evenness result
    return isEven;
}