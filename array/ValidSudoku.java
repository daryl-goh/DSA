class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create a set to store the unique occurrences of numbers in rows, columns, and blocks
        Set<String> set = new HashSet<>();
        
        // Iterate through each cell of the Sudoku board
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                // Get the number at the current cell
                char number = board[row][column];
                
                // Check if the current cell contains a number
                if (number != '.') {
                    // Construct unique keys for the number's occurrences in rows, columns, and blocks
                    // Add the keys to the set and check if they are already present
                    // If any key is already present in the set, it indicates a duplicate occurrence, and the Sudoku is invalid
                    if (!set.add(number + " in row " + row) ||
                            !set.add(number + " in column " + column) ||
                            !set.add(number + " in block " + (row / 3) + "," + (column / 3)))
                        return false;
                }
            }
        }
        
        // If no duplicates are found, the Sudoku is valid
        return true;
    }
}



/*
The code uses a set to keep track of the unique occurrences of numbers in rows, columns, and blocks. 

It iterates through each cell of the Sudoku board and checks if the number at the current cell is a valid entry. 
If it is a valid number (not equal to '.'), the code constructs unique keys for the number's occurrences in rows, columns, and blocks.

The keys are of the form <number> in <row/column/block> <index>. The keys are added to the set, and if any key is already present in the set, 
it indicates a duplicate occurrence of the number, and the Sudoku board is invalid. In that case, the code returns false.

If no duplicates are found for any number, the Sudoku board is considered valid, and the code returns true.
 */