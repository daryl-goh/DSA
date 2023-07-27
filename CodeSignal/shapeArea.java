public class shapeArea {
    int solution(int n) {
        // n = 1 : 1 
        // n = 2 : 5  
        // n = 3 : 13 
        // n = 4 : 25 
        // n = 5 : 41 
        
        return n * ((n - 1) * 2) + 1;
    }
}
