/*
 * Given an array of positive integers a, your task is to calculate the sum of every possible a[i] ∘ a[j], 
 * where a[i] ∘ a[j] is the concatenation of the string representations of a[i] and a[j] respectively.
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
