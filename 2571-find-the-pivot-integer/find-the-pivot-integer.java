class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;  // sum of 1 to n

        for (int i = 1; i <= n; i++) {
            int leftSum = i * (i + 1) / 2;
            int rightSum = total - leftSum + i;
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}
