class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return canBreak(s, wordDict, new HashMap<>());
    }

    private boolean canBreak(String s, List<String> wordDict, Map<String, Boolean> memo) {
        if (s.length() == 0) return true;
        if (memo.containsKey(s)) return memo.get(s);

        String k = "";
        for (int i = 0; i < s.length(); i++) {
            k += s.charAt(i);
            if (wordDict.contains(k)) {
                String remaining = s.substring(i + 1);
                if (canBreak(remaining, wordDict, memo)) {
                    memo.put(s, true);
                    return true;
                }
            }
        }

        memo.put(s, false);
        return false;
    }
}
