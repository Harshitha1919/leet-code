class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
           List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // optional, helps pruning
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            // found a valid combination
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                // no need to continue, as array is sorted
                break;
            }
            
            current.add(candidates[i]); // choose the number
            backtrack(candidates, target - candidates[i], i, current, result); // reuse the same number
            current.remove(current.size() - 1); // backtrack
        }

    }
}