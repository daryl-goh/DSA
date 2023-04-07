/*
 * You are given an array of non-negative integers numbers. 
 * You are allowed to choose any number from this array and swap any two digits in it. 
 * If after the swap operation the number contains leading zeros, they can be omitted and not considered 
 * (eg: 010 will be considered just 10).
 * Your task is to check whether it is possible to apply the swap operation at most once, 
 * so that the elements of the resulting array are strictly increasing.
 */

boolean solution(int[] numbers) {
    // for loop: numbers[i] = numbers[i]%10
    
    int count = 0;
    
    int reset = 0;
    
    for (int i = 0; i < numbers.length -1; i++) {
        
        if (numbers[i] < 10) {
            numbers[i] = numbers[i];
            
            checkStrictlyIncreasing(numbers);
            //     if (numbers[i] >= numbers[i+1]) {
            //     return false;
            // }
        }
        
        if (numbers[i] >= 10 && numbers[i] <= 99) {
            
            reset = numbers[i];
            
            String concatenatedIntegers = Integer.toString(numbers[i] % 10) + Integer.toString(Math.abs(numbers[i]/10));
            numbers[i] = Integer.parseInt(concatenatedIntegers);
            System.out.println(">>> 2 digit numbers:" + Arrays.toString(numbers));
          
            // numbers[i] = reset; 
                if (numbers[i] >= numbers[i+1]) {
                return false;
            }
        
        }
        
        if (numbers[i] >= 100 && numbers[i] < 1000) {
            reset = numbers[i];
            String concatenatedIntegers2 = Integer.toString(numbers[i] % 10) + Integer.toString((numbers[i]/10) % 10) + Integer.toString(Math.abs(numbers[i]/100));
            numbers[i] = Integer.parseInt(concatenatedIntegers2);
            System.out.println(">>> 3 digit numbers:" + Arrays.toString(numbers));
          
            // numbers[i] = reset;
                if (numbers[i] >= numbers[i+1]) {
                return false;
                
            }
        }
        
        
        if (numbers[i] == 1000) {
            reset = numbers[i];
            numbers[i] = 1;
          
            // numbers[i] = reset;
            if (numbers[i] >= numbers[i+1]) {
                return false;
            }
        }
            
    }
        return true;
}


boolean checkStrictlyIncreasing(int[] array){
        boolean result=true;
        int i;
        for(i=0;i<array.length-1;i++){
            if(array[i]>=array[i+1])
            {
                result=false;
                break;
            }
        }
        return result;
    }
 