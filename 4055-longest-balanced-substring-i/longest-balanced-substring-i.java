import java.util.*;

class Solution {
    public int longestBalanced(String s) {
        int max1 = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> hs = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                hs.put(s.charAt(j), hs.getOrDefault(s.charAt(j), 0) + 1);

                int val = -1;
                boolean balanced = true;

                for (Integer value : hs.values()) {
                    if (val == -1) val = value;
                    else if (val != value) {
                        balanced = false;
                        break;
                    }
                }

               
                if (balanced) max1 = Math.max(max1, j - i + 1);
            }
        }

        return max1;
    }
}
