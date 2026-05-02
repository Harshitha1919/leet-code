class Solution {
    public int rotatedDigits(int n) {
        int c = 0;

        for (int i = 1; i <= n; i++) {   
            int num = i;
            int ans = 0;
            int count = 0;
            boolean changed = false;     // ✅ new: to track change

            while (num > 0) {
                int rem = num % 10;

                if (rem == 0 || rem == 1 || rem == 8) {
                    ans = ans * 10 + rem;   // ✅ keep structure consistent
                }
                else if (rem == 2) {
                    ans = ans * 10 + 5;
                    changed = true;
                }
                else if (rem == 5) {
                    ans = ans * 10 + 2;
                    changed = true;
                }
                else if (rem == 6) {
                    ans = ans * 10 + 9;
                    changed = true;
                }
                else if (rem == 9) {
                    ans = ans * 10 + 6;     // ✅ fix: 9 → 6
                    changed = true;
                }
                else {
                    count = 1;              // invalid digit
                    break;
                }

                num = num / 10;
            }

            // ✅ fix: valid + must change
            if (count == 0 && changed) {
                c++;
            }
        }

        return c;
    }
}