class Solution {
    public void sortColors(int[] num) {

        int low = 0;
        int mi = 0;
        int high = num.length - 1;

        while (mi <= high) {

            if (num[mi] == 0) {

                int temp = num[mi];
                num[mi] = num[low];
                num[low] = temp;

                low++;
                mi++;
            }

            else if (num[mi] == 1) {
                mi++;
            }

            else if (num[mi] == 2) {

                int temp = num[mi];
                num[mi] = num[high];
                num[high] = temp;

                high--;
            }
        }
    }
}