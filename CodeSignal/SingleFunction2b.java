long solution(int[] arr)  {
    long result = 0;
    for(int start = 0; start<arr.length-1; start++) {
        int end = start+1;
        while(end<arr.length && isValid(start, end, arr)) {
            result++;
            end++;
        }
    }
    return result;
}

private boolean isValid(int start, int end, int[] arr) {
    for(int i = start+1; i<=end; i++) {
        int current = arr[i], prev = arr[i-1];
        if(i == end) {
            if(current > prev || current < prev) {
                continue;
            }  else {
                return false;
            }
        } else {
            int next = arr[i+1];
            if(current > next && current > prev || current < next && current < prev) {
                continue;
            } else {
                return false;
            }
        }
    }
    return true;
}