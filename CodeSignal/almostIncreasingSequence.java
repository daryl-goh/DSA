public class almostIncreasingSequence {
    boolean solution(int[] sequence) {
    
        int count1 = 0;
        int count2 = 0;
        
        // to check 1st and 2nd element (1,2,1)
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i+1]) {
                count1 ++;
            }
        }
        // to check 1st and 3rd element (1, 2, 1, 2)
        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] >= sequence[i+2]) {
                count2 ++;
            }
        }
      
        System.out.println("After interation count1: "+ count1);
        System.out.println("After interation count2: "+ count2);
        
       
        return (count1 <= 1 && count2 <= 1);
    
    }    
    
}
