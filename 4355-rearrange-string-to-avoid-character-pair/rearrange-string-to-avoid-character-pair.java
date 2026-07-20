class Solution {
    public String rearrangeString(String s, char x, char y) {

        StringBuilder sb = new StringBuilder();
        int c = 0;   // count of y
        int co = 0;  // count of x

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == y) {
                c++;
            } else if (s.charAt(i) == x) {
                co++;
            } else {
                sb.append(s.charAt(i));
            }
        }

        for (int i = 0; i < c; i++) {
            sb.insert(0, y);
        }

        for (int i = 0; i < co; i++) {
            sb.append(x);
        }

        return sb.toString();
    }
}