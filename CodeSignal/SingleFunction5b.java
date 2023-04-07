/*
 * Given an array of positive integers a, your task is to calculate the sum of every possible a[i] ∘ a[j], 
 * where a[i] ∘ a[j] is the concatenation of the string representations of a[i] and a[j] respectively.
 */

 /* Tests passed: 16/16. 
    Sample tests:
    8/8
    Hidden tests:
    8/8
    Score:
    500/500
*/


 long solution(int[] a) {
    long sum1 = 0;
    long sum2 = 0;
      
    for(int i: a) {
        sum1 += i;
        String ai = Integer.toString(i);
        sum2 += Double.valueOf(Math.pow(10, ai.length())).longValue();
    }


    long sum = sum1*a.length + sum1*sum2;
    
    return sum;
}




/*
    Tests passed: 14/16. 
    Execution time limit exceeded on test 15: Program exceeded the execution time limit. Make sure that it completes execution in a few seconds for any possible input.
    Click the "Run Tests" button to see output, console logs, and detailed error messages for sample or custom test cases. 
    This information is hidden when clicking the "Submit" button in order to prevent hard-coding solutions to the hidden test cases.
    Sample tests:
    8/8
    Hidden tests:
    6/8
    Score:
    417/500
 */




long solution(int[] a) {
    long sum = 0;
   StringBuilder sb = new StringBuilder();
   
   for (int i = 0; i < a.length; i++) {
       for (int j = 0; j < a.length; j++) {
           // if (i == j) {
           //     continue;
           // }
           sb.append(a[i]).append(a[j]);
           sum += Long.parseLong(sb.toString());

           // sets the length of the internal character array to zero, which effectively removes all characters from the StringBuilder.
           sb.setLength(0);
       }
   }
   return sum;
}

sysout  