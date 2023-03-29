String solution(String s) {
    
    int max=0; // Initialize a variable to keep track of the maximum length palindrome found so far.

   for(int i=2;i<=s.length();i++){ // Loop through all possible substrings of length 2 or more in the input string.

       String s1 = s.substring(0,i); // Get the substring of length i starting from index 0.
       StringBuilder go = new StringBuilder(s1); // Create a new StringBuilder object from the substring s1.
       String s2= String.valueOf(go.reverse()); // Reverse the StringBuilder object and convert it back to a String.

       if(s2.equals(s1)){ // Check if the reversed string is equal to the original string, indicating that it is a palindrome.
           if(s2.length()>max) // If it is a palindrome and its length is greater than the current maximum length, update the maximum length.
                   max= s2.length();
       }
   }

   if (max>1) { // If a palindrome of length 2 or more is found,
      // Recursively call the solution method on the remaining substring after the palindrome.
        return solution(s.substring(max)); // Return the result of the recursive call.
       
       
   }
       
   else { // If no palindrome of length 2 or more is found,
       return s.substring(max); // Return the remaining substring.
   }
}
   
   

/*
 * The difference between return solution(s.substring(max)) and return s.substring(max) is that the former recursively calls the solution method on the 
 * remaining substring after a palindrome is found, while the latter simply returns the remaining substring.
 * return solution(s.substring(max)) is used when a palindrome of length 2 or more is found in the input string. 
 * In this case, the method needs to continue searching for more palindromes in the remaining substring after the current palindrome. 
 * So, it recursively calls the solution method on the remaining substring and returns the result of that call.
 * return s.substring(max) is used when no palindrome of length 2 or more is found in the input string. 
 * In this case, the method simply returns the remaining substring as is because there are no more palindromes to search for.
 * So, the choice of which one to use depends on the requirements of your program. If you need to continue searching for palindromes in the remaining substring, 
 * you should use return solution(s.substring(max)). Otherwise, you should use return s.substring(max).
 */