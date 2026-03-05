class Solution {
    public String decodeMessage(String key, String message) {

        char[] arr = new char[26];
        boolean[] seen = new boolean[26];
        char ch = 'a';

        for(int i = 0; i < key.length(); i++){
            char c = key.charAt(i);

            if(c != ' ' && !seen[c - 'a']){
                arr[c - 'a'] = ch;
                seen[c - 'a'] = true;
                ch++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < message.length(); i++){
            char c = message.charAt(i);

            if(c == ' ')
                sb.append(' ');
            else
                sb.append(arr[c - 'a']);
        }

        return sb.toString();
    }
}