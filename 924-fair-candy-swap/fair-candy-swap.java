class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum1 += b[i];
        }

        int[] k = new int[2];

        for (int i = 0; i < a.length; i++) {
           

            for (int j = 0; j < b.length; j++) {
                 int temp1 = sum - a[i]+b[j];   // Alice sum after giving a[i]
                int temp = sum1 - b[j] + a[i];  // Bob sum after swap

                if (temp == temp1) {
                    k[0] = a[i];
                    k[1] = b[j];
                    return k;   // return immediately when found
                }
            }
        }
        return k;
    }
}
