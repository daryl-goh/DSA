int[] solution(int[] a) {

    // Step 1: Create a copy of the input array a using the clone() method
    int[] duplicatedArray = a.clone();
    
    // Step 2: Sort the copy of array a using the sort() method in Arrays class
    Arrays.sort(duplicatedArray);
    
    // Step 3: Create a new ArrayList to store the sorted elements from duplicatedArray
    List<Integer> tempList = new ArrayList<>();
    
    // Step 4: Traverse the sorted duplicatedArray and add all non-negative elements into the ArrayList 
    for (int i = 0; i < duplicatedArray.length; i++ ) {
        if (duplicatedArray[i] != -1) {
            tempList.add(duplicatedArray[i]);
        }
    }
    
    // Step 5: Traverse the original array a and replace non-negative elements with the elements in the ArrayList 
    for (int i = 0, j = 0; i < a.length; i++) {
        if (a[i] != -1) {
            a[i] = tempList.get(j);
            j++;
        }
    
    // Step 6: Return the modified array a
    return a;
}