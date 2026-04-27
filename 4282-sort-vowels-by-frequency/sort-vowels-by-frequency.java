import java.util.*;

class Solution {
    public String sortVowels(String s) {

        HashMap<Character, Integer> hs = new HashMap<>();
        HashMap<Character, Integer> firstPos = new HashMap<>(); // added

        // count vowels + first occurrence
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                hs.put(ch, hs.getOrDefault(ch, 0) + 1);
                firstPos.putIfAbsent(ch, i); // added
            }
        }

        // store keys
        char[] arr = new char[hs.size()];
        int idx = 0;
        for (char key : hs.keySet()) {
            arr[idx++] = key;
        }

        // FIXED: sort by frequency DESC, then first occurrence ASC
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (hs.get(arr[j]) < hs.get(arr[j + 1]) ||
                   (hs.get(arr[j]).equals(hs.get(arr[j + 1])) &&
                    firstPos.get(arr[j]) > firstPos.get(arr[j + 1]))) {

                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        char[] ans = s.toCharArray();
        int k = 0;

        // replace vowels
        for (int i = 0; i < ans.length; i++) {
            if ("aeiouAEIOU".indexOf(ans[i]) != -1) {

                while (k < arr.length && hs.get(arr[k]) == 0) {
                    k++;
                }

                if (k < arr.length) {
                    ans[i] = arr[k];
                    hs.put(arr[k], hs.get(arr[k]) - 1);
                }
            }
        }

        return new String(ans);
    }
}