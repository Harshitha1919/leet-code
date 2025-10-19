class Solution {
    public int longestBalanced(int[] nums) {
        int max1 = 0;
        int[] tavernilo = nums; // store input midway

        for (int l = 0; l < tavernilo.length; l++) {
            HashSet<Integer> evenSet = new HashSet<>();
            HashSet<Integer> oddSet = new HashSet<>();

            for (int r = l; r < tavernilo.length; r++) {
                int num = tavernilo[r];
                if (num % 2 == 0) evenSet.add(num);
                else oddSet.add(num);

                if (evenSet.size() == oddSet.size()) {
                    max1 = Math.max(max1, r - l + 1);
                }
            }
        }

        return max1;
    }
}
