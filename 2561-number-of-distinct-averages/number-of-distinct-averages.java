class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums) {
            arr.add(i);
        }

        HashSet<Double> hs = new HashSet<>();

        while (arr.size() > 0) {
            int min = arr.get(0);
            int max = arr.get(arr.size() - 1);

            double avg = (min + max) / 2.0;
            hs.add(avg);

            arr.remove(0);
            arr.remove(arr.size() - 1);
        }

        return hs.size();
    }
}
