package leetcode.array;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // create a new array to hold the intervals, with one extra row for the new interval
        int[][] finalIntervs = new int[intervals.length + 1][2];

        // copy the existing intervals into the new array
        for (int i = 0; i < intervals.length; i++) {
            finalIntervs[i] = intervals[i];
        }

        // add the new interval to the end of the new array
        finalIntervs[finalIntervs.length - 1] = newInterval;

        // sort the new array in ascending order by the start time of each interval
        Arrays.sort(finalIntervs, (a, b) -> a[0] - b[0]);

        // create a new list to hold the merged intervals
        List<int[]> merged = new ArrayList<>();

        // loop through each interval in the sorted array
        for (int i = 0; i < finalIntervs.length; i++) {
            // get the start and end times of the current interval
            int start = finalIntervs[i][0];
            int end = finalIntervs[i][1];

            // if the merged list is empty or the last interval in the list does not overlap with the current interval,
            // add the current interval to the merged list
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < start) {
                merged.add(new int[] { start, end });
            }
            // otherwise, merge the current interval with the last interval in the merged list
            else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], end);
            }
        }

        // convert the merged list to a 2D array and return it
        int[][] result = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            result[i] = merged.get(i);
        }
        return result;
    }
}