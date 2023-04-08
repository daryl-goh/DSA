boolean solution(int[] a, int[] b) {
    
    // Create an empty list to store indices of elements that need to be swapped
    List<Integer> swapList = new ArrayList<>();
    
    // Loop through the arrays and check if the elements at each index are different
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
            // If elements are different, add the index to the swapList
            swapList.add(i);
        }
    }
    
    // If the swapList is empty, the arrays are already identical, so return true
    if (swapList.size() == 0) {
        return true;
    }
    
    // If the swapList has more than two indices, it's not possible to make the arrays identical with one swap, so return false
    if (swapList.size() != 2) {
        return false;
    }
    
    // Extract the indices from the swapList
    int idx1 = swapList.get(0);
    int idx2 = swapList.get(1);
    
    // Check if swapping the elements at idx1 and idx2 in array a will result in array b
    if (a[idx1] == b[idx2] && a[idx2] == b[idx1]) {
        return true;
    }
    
    // If swapping elements at idx1 and idx2 does not result in array b, then return false
    return false;
}