String solution(String s) {
   
    int max = 0; 
    
    for (int i = 2 ; i <= s.length(); i++) {
        String s1 = s.substring(0, i);
        System.out.println(">>>s1: " + s1);
        StringBuilder go = new StringBuilder(s1);
        String s2 = go.reverse().toString();
        
        if (s2.equals(s1)) {
            if (s2.length()>max) {
                max = s2.length();
                System.out.println(">>>>max: " + max);
            }
        }
    }
        
        if (max > 1) {
            System.out.println(">>>> RECURSIVE CALL: MAX + = " + max);
            return solution(s.substring(max));
        }
        
        else {
            return s.substring(max);
        }
                                                     
}