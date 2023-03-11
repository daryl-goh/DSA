package leetcode.CodeSignal;

public class adjacentElementsProduct {

    int solution(int[] inputArray) {

        int temp = Integer.MIN_VALUE;
        
        for (int i = 0; i < inputArray.length -1; i++) {
            
                int multi = inputArray[i] * inputArray[i + 1];
                if (multi > temp) {
                    temp = multi;
                }
        }
        return temp;    
    }
    
    
}
