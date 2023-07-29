class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number using a HashMap
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        // Step 2: Create buckets to store numbers based on their frequencies
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int n : counts.keySet()) {
            int count = counts.get(n);
            // Create a new list for each frequency bucket
            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }
            // Add the number to the corresponding frequency bucket
            bucket[count].add(n);
        }

        // Step 3: Retrieve the top K frequent elements from the buckets
        int[] res = new int[k];
        int j = 0;
        for (int i = nums.length; i >= 0; i--) {
            // Skip empty buckets
            if (bucket[i] == null) continue;
            // Add numbers from the bucket to the result array
            for (int n : bucket[i]) {
                res[j++] = n;
                // If we have retrieved K numbers, return the result
                if (j == k) {
                    return res;
                }
            }
        }

        return res;
    }
}