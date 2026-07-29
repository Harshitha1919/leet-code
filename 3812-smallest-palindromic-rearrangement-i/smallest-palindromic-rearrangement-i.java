import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        char[] a = new char[s.length() / 2];

        for (int i = 0; i < s.length() / 2; i++) {
            a[i] = s.charAt(i);
        }

        Arrays.sort(a);

        StringBuilder ans = new StringBuilder();

        if (s.length() % 2 == 0) {

            for (int i = 0; i < a.length; i++) {
                ans.append(a[i]);
            }

            for (int i = a.length - 1; i >= 0; i--) {
                ans.append(a[i]);
            }

        } else {

            for (int i = 0; i < a.length; i++) {
                ans.append(a[i]);
            }

            ans.append(s.charAt(s.length() / 2));

            for (int i = a.length - 1; i >= 0; i--) {
                ans.append(a[i]);
            }
        }

        return ans.toString();
    }
}