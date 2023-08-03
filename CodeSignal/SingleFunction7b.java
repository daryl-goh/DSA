/*
You've created a new programming language, and now you've decided to add hashmap support to it.
Actually you are quite disappointed that in common programming languages it's impossible to add a number to all hashmap keys, or all its values. 
So you've decided to take matters into your own hands and implement your own hashmap in your new language that has the following operations:

insert x y - insert an object with key x and value y.
get x - return the value of an object with key x.
addToKey x - add x to all keys in map.
addToValue y - add y to all values in map.
To test out your new hashmap, you have a list of queries in the form of two arrays: queryTypes contains the names of the methods to be called (eg: insert, get, etc), 
and queries contains the arguments for those methods (the x and y values).

Your task is to implement this hashmap, apply the given queries, and to find the sum of all the results for get operations.
 */


long solution(String[] queryType, int[][] query) {
    // Initialize variables to keep track of the current key and value increments, and a HashMap to store key-value pairs.
    int curKeyInc = 0;
    int curValInc = 0;
    HashMap<Integer, Integer> mp = new HashMap<>();
    // Initialize a variable to store the final answer.
    long ans = 0;

    // Iterate through each query.
    for (int i = 0; i < queryType.length; i++) {
        // If the query type is "insert", add the key-value pair to the HashMap after adjusting the current increments.
        if (queryType[i].equals("insert")) {
            mp.put(query[i][0] - curKeyInc, query[i][1] - curValInc);
        }
        // If the query type is "addToValue", update the current value increment.
        else if (queryType[i].equals("addToValue")) {
            curValInc += query[i][0];
        }
        // If the query type is "addToKey", update the current key increment.
        else if (queryType[i].equals("addToKey")) {
            curKeyInc += query[i][0];
        }
        // If the query type is "get", find the corresponding value in the HashMap using the adjusted key and calculate the final result.
        else {
            ans += mp.getOrDefault(query[i][0] - curKeyInc, -1 * curValInc) + curValInc;
        }
    }

    // Return the final result.
    return ans;
}