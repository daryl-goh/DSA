package CodeSignal;

public class matrixElementsSum {
    
    int solution(int[][] matrix) {
    
        // declare count variable to keep track of count
        int count = 0;
        
        // iterate through sub array (column)
        for (int j = 0; j < matrix[0].length; j++){
            
            // iterate through main array (row)
            for (int i = 0; i < matrix.length; i++) {
                
                // if [j] = 0, break to get out of loop and stop iteration
                if (matrix[i][j] ==0) {
                    break;
                    
                }
                // add each element to count
                count += matrix[i][j];
                
            }
        }
        System.out.println("Outside Loop: " + count);
        
        // return count
        return count;
    
    }
    
}
