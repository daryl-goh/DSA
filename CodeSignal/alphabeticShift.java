String solution(String inputString) {

    char[] ca = inputString.toCharArray();
    
    for (int i = 0; i < ca.length; i++) {
        if (ca[i] == 'z') {
            ca[i] = 'a';
        }
        else {
            ca[i]++;
           
        }
    }
    
    return new String(ca);
}
