class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(-1);
            } else {
                int top = st.peek();

                if (top == -1) {
                    st.pop();
                    st.push(1);
                } else {
                    int sum = 0;

                    while (st.size() > 0 && st.peek() != -1) {
                        sum += st.pop();
                    }

                    st.pop();
                    st.push(sum * 2);
                }
            }
        }

        int ans = 0;

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}