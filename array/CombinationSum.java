class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> individualList = new ArrayList<>();
        backtrack(candidates, target, 0, individualList, finalList);
        return finalList;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> individualList, List<List<Integer>> finalList) {
        if (target == 0) {
             finalList.add(new ArrayList<>(individualList));
             return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                individualList.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, individualList, finalList);
                individualList.remove(individualList.size() - 1);
            }
        }
    }
}