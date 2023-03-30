int[] solution(int[] a) {

    // Step 1: Create a HashMap to store the frequency of each digit
    Map<Integer, Integer> digitFrequency = new HashMap<>();

    // Step 2: Iterate through the array and update the digit frequency
    for (int num : a) {
        while (num > 0) {
            int digit = num % 10;
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
            num /= 10;
        }
    }

    // Step 3: Find the maximum frequency of any digit
    int maxFrequency = 0;
    for (int frequency : digitFrequency.values()) {
        maxFrequency = Math.max(maxFrequency, frequency);
    }

    // Step 4: Iterate through the HashMap and find digits with max frequency
    List<Integer> mostFrequentDigits = new ArrayList<>();
    for (int digit : digitFrequency.keySet()) {
        if (digitFrequency.get(digit) == maxFrequency) {
            mostFrequentDigits.add(digit);
        }
    }

    // Step 5: Convert List to array and sort in ascending order
    int[] result = new int[mostFrequentDigits.size()];
    for (int i = 0; i < mostFrequentDigits.size(); i++) {
        result[i] = mostFrequentDigits.get(i);
    }
    Arrays.sort(result);
    return result;
}
