boolean solution(String name) {
      
   if (name.matches("^[a-zA-Z0-9_]*$") && !Character.isDigit(name.charAt(0))) {
        return true;
    }
    
    return false;
}
