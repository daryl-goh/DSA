class Solution {
    public int maxArea(int[] height) {

        int maxVolume = 0;       // Initialize the maximum volume of water
        int left = 0;           // Pointer to the left-most element of the array
        int right = height.length - 1;  // Pointer to the right-most element of the array

        // Iterate until the left and right pointers meet
        while (left < right) {
            int w = right - left;   // Calculate the width (horizontal distance) between the two pointers
            int h = Math.min(height[left], height[right]);  // Calculate the height of the container (minimum of the two heights)
            int area = w * h;       // Calculate the area of the container formed by the two pointers
            maxVolume = Math.max(maxVolume, area);  // Update the maximum volume if the current area is greater

            // Move the pointer that points to the smaller height towards the center
            if (height[left] < height[right]) {
                left++;
            }

            // Move the pointer that points to the larger height towards the center
            else if (height[left] > height[right]) {
                right--;
            }

            // If both heights are equal, move both pointers towards the center
            else {
                left++;
                right--;
            }
        }
        return maxVolume; // Return the maximum volume of water trapped between two lines
    }
}


/*
 * 
The rationale behind moving the left or right pointers (or both together) in the maxArea algorithm is to explore all possible combinations of lines 
and find the maximum volume of water that can be trapped between two vertical lines.

The key idea is that the maximum volume of water between two lines is determined by the minimum of the two heights and the distance between the lines (width). 
By starting with the two pointers at the outermost ends of the array, we consider the widest possible container. 
Then, as we move the pointers towards each other, we try to maximize the volume by looking for taller lines. Here's the rationale behind each movement:

If the height of the line pointed to by the left pointer is less than the height of the line pointed to by the right pointer (height[left] < height[right]), it means that the left line is shorter. 
To maximize the volume, we move the left pointer towards the right, hoping to find a taller line that could potentially result in a larger volume.

If the height of the line pointed to by the left pointer is greater than the height of the line pointed to by the right pointer (height[left] > height[right]), it means that the right line is shorter. 
To maximize the volume, we move the right pointer towards the left, hoping to find a taller line that could potentially result in a larger volume.

If the height of the line pointed to by the left pointer is equal to the height of the line pointed to by the right pointer (height[left] == height[right]), it means both lines have the same height. 
In this case, moving either pointer towards the center will not yield a larger volume, as it would reduce the width of the container. 
So, to explore other possibilities, we move both pointers towards the center, considering a narrower container but with potentially taller lines.

By repeatedly moving the pointers based on the conditions above and calculating the volume at each step, the algorithm explores all possible combinations of lines 
and eventually finds the maximum volume of water that can be trapped between any two vertical lines in the array.
 */