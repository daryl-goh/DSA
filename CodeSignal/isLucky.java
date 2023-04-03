boolean solution(int n) {

    // Convert the ticket number to a string
    String ticketNumber = Integer.toString(n);
    
    // Split the string into two halves
    int halfLength = ticketNumber.length() / 2;
    String firstHalf = ticketNumber.substring(0, halfLength);
    String secondHalf = ticketNumber.substring(halfLength + (ticketNumber.length() % 2 == 0 ? 0 : 1));
    
    // Convert the halves to arrays of integers and sum them up
    int firstHalfSum = 0;
    for (char digit : firstHalf.toCharArray()) {
        firstHalfSum += digit - '0';
    }
    
    int secondHalfSum = 0;
    for (char digit : secondHalf.toCharArray()) {
        secondHalfSum += digit - '0';
    }
    
    // Compare the sums and return the result
    return firstHalfSum == secondHalfSum;
}


