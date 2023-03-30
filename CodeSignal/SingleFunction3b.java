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
    
