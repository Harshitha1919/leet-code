class Solution {
    public int numberOfSpecialChars(String word) {

        boolean lower[] = new boolean[26];
        boolean upper[] = new boolean[26];

        int count = 0;

        HashMap<Character, Integer> lower1 = new HashMap<>();
        HashMap<Character, Integer> upper1 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (lower1.containsKey(ch)) {
                    lower1.put(ch, i);
                }

                else {
                    lower1.put(ch, i);
                    lower[ch - 'a'] = true;
                }
            }

            else if (ch >= 'A' && ch <= 'Z') {

                if (upper[ch - 'A'] == false) {

                    upper[ch - 'A'] = true;
                    upper1.put(ch, i);
                }
            }
        }

        for (int i = 0; i < 26; i++) {

            if (lower[i] == true &&
                upper[i] == true &&
                lower1.get((char) ('a' + i)) <
                upper1.get((char) ('A' + i))) {

                count++;
            }
        }

        return count;
    }
}