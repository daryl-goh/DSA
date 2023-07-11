int[][] solution(boolean[][] minefield) {
    int mineCount = 0; // Variable to keep track of the number of adjacent mines
    int numRows = minefield.length; // Number of rows in the minefield
    int numCols = minefield[0].length; // Number of columns in the minefield
    int[][] result = new int[numRows][numCols]; // Result matrix to store the counts of adjacent mines
    
    for (int i = 0; i < numRows; i++) { // Iterate over each row in the minefield
        for (int j = 0; j < numCols; j++) { // Iterate over each column in the minefield
            for (int xOffset = -1; xOffset < 2; xOffset++) { // Iterate over x-offsets of neighboring cells (-1, 0, 1)
                for (int yOffset = -1; yOffset < 2; yOffset++) { // Iterate over y-offsets of neighboring cells (-1, 0, 1)
                    if (i + xOffset >= 0 && i + xOffset < numRows && j + yOffset >= 0 && j + yOffset < numCols) {
                        // Check if the neighboring cell is within the bounds of the minefield
                        
                        if (i + xOffset == i && j + yOffset == j) // Skip the current cell, continue to the next iteration
                            continue;
                        
                        if (minefield[i + xOffset][j + yOffset]) // Check if the neighboring cell contains a mine
                            mineCount++; // Increment the count of adjacent mines
                    }
                }
            }
            
            result[i][j] = mineCount; // Assign the count to the current cell in the result matrix
            mineCount = 0; // Reset the count variable for the next cell
        }
    }
    
    return result; // Return the result matrix
}