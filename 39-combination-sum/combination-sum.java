class Solution {
    List<List<Integer>> arr = new ArrayList<>();

    public void sum(int[] c, int target, int sum, int start, List<Integer> ans) {
        
        if (sum == target) {
            arr.add(new ArrayList<>(ans));
            return;
        }

        for (int i = start; i < c.length; i++) {
            
            if (sum + c[i] <= target) {
                ans.add(c[i]);

                sum(c, target, sum + c[i], i, ans);

                ans.remove(ans.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] c, int target) {
        sum(c, target, 0, 0, new ArrayList<>());
        return arr;
    }
}