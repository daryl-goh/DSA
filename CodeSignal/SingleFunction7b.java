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
 
    Map<Integer, Integer> newMap = new HashMap<>();
    
    long sum = 0;
    var map = new OffsetIntegerMap();
    for (int i = 0; i < queryType.length; i++) {
        String currQuery = queryType[i];
        switch (currQuery) {
            case "insert":
                map.put(query[i][0], query[i][1]);
                break;
            case "addToValue":
                map.addToValues(query[i][0]);
                break;
            case "addToKey":
                map.addToKeys(query[i][0]);
                break;
            case "get":
                sum += map.get(query[i][0]);
        }
    }
    return sum;
    }
    
    
    
public class OffsetIntegerMap {
    private final Map<Integer, Integer> actualMap;
    private int keyOffset = 0;
    private int valueOffset = 0;

    public OffsetIntegerMap() {
        actualMap = new HashMap<>();
    }

    public int size() {
        return actualMap.size();
    }

    public boolean isEmpty() {
        return actualMap.isEmpty();
    }

    public boolean containsKey(int key) {
        var keyWithoutOffset = key - keyOffset;
        return actualMap.containsKey(keyWithoutOffset);
    }

    public boolean containsValue(int value) {
        var valueWithoutOffset = value - valueOffset;
        return actualMap.containsValue(valueWithoutOffset);
    }

    public Integer get(int key) {
        var keyWithoutOffset = key - keyOffset;
        var value = actualMap.get(keyWithoutOffset);
        if (value == null) return null;
        return value + valueOffset;
    }

    public Integer put(int key, int value) {
        var keyWithoutOffset = key - keyOffset;
        var valueWithoutOffset = value - valueOffset;
        var oldValue = actualMap.put(keyWithoutOffset, valueWithoutOffset);
        if (oldValue == null) return null;
        return oldValue + valueOffset;
    }

    public Integer remove(int key) {
        var keyWithoutOffset = key - keyOffset;
        var oldValue = actualMap.remove(keyWithoutOffset);
        if (oldValue == null) return null;
        return oldValue + valueOffset;
    }

    public void clear() {
        actualMap.clear();
        keyOffset = 0;
        valueOffset = 0;
    }

    public int getKeyOffset() {
        return keyOffset;
    }

    public void setKeyOffset(int keyOffset) {
        this.keyOffset = keyOffset;
    }

    public int getValueOffset() {
        return valueOffset;
    }

    public void setValueOffset(int valueOffset) {
        this.valueOffset = valueOffset;
    }

    public void addToValues(int toAdd) {
        this.valueOffset += toAdd;
    }

    public void addToKeys(int toAdd) {
        this.keyOffset += toAdd;
    }
}
    


/*
 * The keyOffset and valueOffset fields are used to maintain offsets for the keys and values in the actualMap of the OffsetIntegerMap class. 
 * These offsets are applied to the keys and values of the map when they are retrieved or modified, but are not actually stored in the map itself.
 * This is useful in the context of the solution method, where the OffsetIntegerMap is used to store and manipulate key-value pairs based on certain queries. 
 * The addToKeys and addToValues methods can be used to modify the offsets, which in turn affects the keys and values in the map. 
 * This allows for efficient manipulation of the key-value pairs without having to modify the actual keys and values in the map.
 * For example, when the addToKeys method is called with a positive integer toAdd, the keyOffset field is incremented by toAdd, 
 * which effectively shifts all the keys in the map by toAdd. When a key is later retrieved from the map using the get method, 
 * the offset is subtracted from the key to obtain the actual key value that was stored in the map.
 * Similarly, the addToValues method is used to modify the offset applied to the values in the map, which allows for efficient modification of 
 * the actual values in the map without having to modify the entire map.
 */