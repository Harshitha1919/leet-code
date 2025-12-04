class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;
        int[] sorted = arr.clone();  
        Arrays.sort(sorted);

        HashMap<Integer, Integer> rank = new HashMap<>();
        int r = 1;

        for (int i = 0; i < n; i++) {
            if (!rank.containsKey(sorted[i])) {
                rank.put(sorted[i], r++);
            }
        }

       
        for (int i = 0; i < n; i++) {
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }
}
