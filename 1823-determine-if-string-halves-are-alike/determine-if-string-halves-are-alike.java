class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < n / 2; i++) {

            // first half
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // second half
            if (isVowel(s.charAt(i + n / 2))) {
                count1++;
            }
        }
        return count == count1;
    }

    private boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
            || c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
