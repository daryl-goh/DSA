int solution(int[] a, int k) {
    
    /*
    When we are shifting the pointers in this binary search implementation, we are shifting them based on the value of the element, not the position.
    
    Here's why: we are searching for a specific value that represents the length of the ribbon that can be cut into k pieces. This value could be anywhere between 1 and the maximum length of the ribbons in the input array.
    
    Initially, we set the left pointer to 0 and the right pointer to the maximum value of the ribbons in the input array. We then use binary search to narrow down the range of possible values by computing the sum of the number of pieces that can be cut from each ribbon of length mid, where mid is the midpoint between the left and right pointers.
    
    If the sum of the number of pieces is greater than or equal to k, then we know that mid could be a valid answer, so we move the left pointer to mid. Otherwise, we know that mid is too large, so we move the right pointer to mid - 1.
    
    By shifting the pointers based on the value of the element, we can efficiently search for the maximum possible length of the ribbon that can be cut into k pieces without having to check each value one by one.
    */
    
            int left = 0;
            int right =  Arrays.stream(a).max().getAsInt();
            while (left < right) {
                int mid = (left + right + 1) / 2;

                // Calculate the total number of ribbons that can be cut with length `mid`
                int sum = 0;
                for (int ribbonLen : a) {
                    sum += ribbonLen / mid;
                }

                // If the total number of ribbons is greater than or equal to `k`,
                // update `left` to `mid`, otherwise update `right` to `mid - 1`
                if (sum >= k) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
            if (left != 0) {
                return left;
            }
            return -1;
        
    }
    
    /*
    When we exit the while loop, the value of the left pointer represents the maximum possible length of the ribbon. If left is not 0, it means that we have found a valid solution, and we return left. Otherwise, it means that there is no valid solution, and we return -1 to indicate that.
    
    We do not return the sum because the sum only represents the number of pieces we can obtain by cutting the ribbons into pieces of length "left." It does not give us the actual length of the ribbon that can be cut into k pieces.
    */
    