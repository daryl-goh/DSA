boolean solution(String inputString) {
    // Split the input string by dot (.) remember to escape the dot
    String[] ipSplit = inputString.split("\\.");

    try {
        // Iterate over each part of the IP address
        for (int i = 0; i < ipSplit.length; i++) {
            // Parse the IP address part to an integer
            Integer ipSplitInt = Integer.parseInt(ipSplit[i]);

            // Check for empty string or incorrect IP address length
            if (ipSplit[i].isEmpty() || ipSplit.length < 4 || ipSplit.length > 4) {
                // Return false if any of the conditions are met
                return false;
            }
            
            // Check for leading zeros in IP address parts
            else if (ipSplit[i].length() > 1 && ipSplit[i].startsWith("0")) {
                // Return false if leading zeros are found
                return false;
            }
            
            // Check if the parsed integer is within the valid range (0-255)
            else if (ipSplitInt < 0 || ipSplitInt > 255) {
                // Return false if the integer is outside the valid range
                return false;
            }
        }
    }
    
    // Catch the NumberFormatException that can occur during parsing
    catch (NumberFormatException e) {
        // Return false if the IP address part is not a valid integer
        return false;
    }
    
    // Return true if all conditions are met and the IP address is valid
    return true;
}