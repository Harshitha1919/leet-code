class Solution {
    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) return false;

        int first = -1, second = -1;
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) first = i;
                else if (second == -1) second = i;
                else return false; 
            }
            freq[s.charAt(i) - 'a']++;
        }

        
        if (first == -1) {
            for (int f : freq) {
                if (f > 1) return true; 
            }
            return false;
        }

        
        return second != -1 &&
               s.charAt(first) == goal.charAt(second) &&
               s.charAt(second) == goal.charAt(first);
    }
}
