class Solution {
    public int majorityElement(int[] nums) {
        // initialize int valueElement = 0 to store value of element
        // create HashMap with key being value of element, and value being the count
        // interate through int[] nums 
        // if map does not contain key, add new value of element to map with count 1
        // if map contains key, add 1 to existing count
        // if value of count more than nums.length/2, assign it to valueElement
        // return valueElement

        
        int valueElement = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num: nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 1);
            }
            else {
                countMap.put(num, countMap.get(num)+1);
            }

            if (countMap.get(num) > nums.length/2) {
                valueElement = num;
                break;
            }
        }
        return valueElement;    
    }    
}