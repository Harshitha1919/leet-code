class Solution {
    public int smallestNumber(int n) {
        while (true) {
            int k = n;
            boolean allOnes = true;

            while (k > 0) {
                if (k % 2 == 0) {
                    allOnes = false;
                    break;
                }
                k = k / 2;
            }

            if (allOnes) return n;
            n++;
        }
    }
}
