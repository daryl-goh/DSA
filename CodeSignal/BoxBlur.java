int[][] solution(int[][] image) {

    // Calculate the dimensions of the resulting new image
    int row = image.length - 2;
    int col = image[0].length - 2;
    
    // Variable to store the sum of pixel values
    int sum = 0;
    
    // Create a new 2D array to store the resulting new image
    int[][] newImage = new int[row][col];
    
    // Loop through the image pixels (excluding the border pixels so iteration starts from i=1 and j=1 and goes up to rows and cols)
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= col; j++) {
            // Calculate the sum of pixel values within a 3x3 neighborhood
            sum = image[i-1][j-1] + image[i-1][j] + image[i-1][j+1] +
            image[i][j-1] + image[i][j] + image[i][j+1] +
            image[i+1][j-1] + image[i+1][j] + image[i+1][j+1];
            
            // Compute the average value and store it in the corresponding position of the new image
            newImage[i-1][j-1] = sum / 9;
        }
    }
    
    // Return the resulting new image
    return newImage;
}