class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();   // make whole string lowercase first

        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            if (w.length() <= 2) {
                sb.append(w);    // already lowercase
            } else {
                sb.append(Character.toUpperCase(w.charAt(0)));
                sb.append(w.substring(1)); // already lowercase
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
