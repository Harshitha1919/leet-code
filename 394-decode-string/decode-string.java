class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<String> st1 = new Stack<>();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                int num = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                st.push(num);
                i--;
            }

            else if (s.charAt(i) == ']') {

                sb1.setLength(0);

                while (!st1.peek().equals("[")) {
                    sb1.insert(0, st1.pop());
                }

                st1.pop();

                int k = st.pop();

                sb.setLength(0);

                for (int j = 0; j < k; j++) {
                    sb.append(sb1);
                }

                st1.push(sb.toString());
            }

            else {
                st1.push(String.valueOf(s.charAt(i)));
            }
        }

        sb.setLength(0);

        while (!st1.empty()) {
            sb.insert(0, st1.pop());
        }

        return sb.toString();
    }
}