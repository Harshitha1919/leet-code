class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for (int x : nums1) hs.add(x);
        for (int x : nums2) hs1.add(x);

        // Find the smallest common number
        int common = Integer.MAX_VALUE;

        for (int x : nums1) {
            if (hs1.contains(x)) {
                common = Math.min(common, x);
            }
        }

        for (int x : nums2) {
            if (hs.contains(x)) {
                common = Math.min(common, x);
            }
        }

        if (common != Integer.MAX_VALUE) return common;

        // No common digit → form smallest 2-digit number
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int a = nums1[0];
        int b = nums2[0];

        return Math.min(a * 10 + b, b * 10 + a);
    }
}
