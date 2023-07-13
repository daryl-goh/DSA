int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
    
    // create new integer array nInputArray
    // iterate through inputArray, add the elements into nInputArray
    // check if element is elemToReplace, if it is then add substitutionElem instead
    
    int[] nInputArray = new int[inputArray.length];
    
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i] != elemToReplace) {
            nInputArray[i] = inputArray[i];
        }
        
        else {
            nInputArray[i] = substitutionElem;
        }
    }
    
    return nInputArray;
}
