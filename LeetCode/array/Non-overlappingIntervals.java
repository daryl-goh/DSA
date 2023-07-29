class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // sort intervals in increasing order of the first element
        // create new variable to hold minimum number of intervals to remove
        // iterate through sorted intervals
        // if length of intervals == 0, return 0
        // else if end of i is bigger than start of i + 1, add to minNumber counter and assign end of i + 1 to minimum of the 2 endpoints
        // return minimum number

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            int minNumber = 0;

        for (int i = 0; i < intervals.length - 1 ; i++) {
           
            
            if (intervals.length == 0 ) {
                return 0;
            }

            /*
             * If the current interval's end is greater than the next interval's start, it means the intervals are overlapping. 
             * In this case, the method increments the minNumber variable by 1 and merges the two overlapping intervals 
             * by updating the end of the next interval to be the minimum of the two end points using the Math.min method.
             */

            else if (intervals[i][1] >intervals[i + 1][0]) {
                minNumber++;
                intervals[i+1][1] = Math.min(intervals[i][1], intervals[i+1][1] ); 
            }
          
        }
        return minNumber;
    }
}