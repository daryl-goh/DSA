int solution(String s) {

    /*
     * You are given a string s. Your task is to count the number of ways of splitting s into three non-empty parts a, b and c (s = a + b + c) 
     * in such a way that a + b, b + c and c + a are all different strings.
     * NOTE: + refers to string concatenation.
     */
    
    // initialize integer count = 0 to keep track of count
    // iterate through string[] after split
    // initialize 3 string variable a, b and c
    // assign substring to a, b and c by substring
    // check if concatenations are equal: a+b=b+c, b+c=c+a, a+b=c+a
    // add to count if not equal
    // don't add to count if equal
    // return count
    
    int count = 0;
    
    for (int i = 1; i < s.length(); i++) {
        for (int j = i + 1; j < s.length(); j++) {
            String a = s.substring(0, i);
            String b =  s.substring(i, j);
            String c = s.substring(j);
            
            if (!a.concat(b).equals(b.concat(c)) 
            && !b.concat(c).equals(c.concat(a))
            && !c.concat(a).equals(a.concat(b))
            ) {
                count++;
            }
        }
    }
      
     return count;
}
