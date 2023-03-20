class Solution {
    public int[][] merge(int[][] intervals) {

        // sort intervals in increasing order of the first element

        // create new list to hold merged intervals

        // iterate through the sorted array

        // if second end(i) is greater than or equal to start(j) of the next element, merge

        // return non-overlapping intervals

        Arrays.sort(intervals, (a, b)->a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            /* This checks whether the merged list is empty or the end point of the last interval in merged is less than the start point of the current interval. 
             * If either of these conditions is true, the current interval is added to the merged list. 
             * Otherwise, the end point of the last interval in merged is updated to be the maximum of its current end point and the end point of the current interval.
             */

            if (merged.isEmpty() || merged.get(merged.size()-1)[1] < start) {
                merged.add(new int[] {start, end});
            }

            else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size()-1)[1], end);
            }
        }

        /*
         * This creates a new two-dimensional array result with the same number of rows as the merged list and two columns. 
         * It then copies each interval in the merged list to a row in result. Finally, it returns result, which contains the merged intervals.
         */

        int[][] result = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            result[i] = merged.get(i);
        }
        return result;
    }
}