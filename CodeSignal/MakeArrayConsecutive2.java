public class MakeArrayConsecutive2 {

    int solution(int[] statues) {
        int count = 0;
        Arrays.sort(statues);
        System.out.println(statues);
        for (int i = 0 ; i < statues.length - 1; i++) {
            if (statues[i+1] - statues[i] > 1) {
                count += (statues[i+1] - statues[i] - 1);
            }
        }
        return count;
    
    }
    
    
}
