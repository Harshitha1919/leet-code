class Solution {
    public String sortSentence(String s) {

        // FIX 1: split by space (words, not characters)
        String[] arr = s.split(" ");

        // FIX 2: HashMap value should be String (not StringBuilder)
        HashMap<Integer, String> hs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String k = arr[i];

            // FIX 3: get position number
            char c = k.charAt(k.length() - 1);
            int pos = c - '0';

            // FIX 4: remove last digit from the word
            String word = k.substring(0, k.length() - 1);

            // FIX 5: store correctly
            hs.put(pos, word);
        }

        // FIX 6: do NOT use keyword `new`
        String result = "";

        for (int i = 1; i <= hs.size(); i++) {
            result = result + hs.get(i);

            // FIX 7: spacing logic
            if (i < hs.size()) {
                result = result + " ";
            }
        }

        return result;
    }
}
