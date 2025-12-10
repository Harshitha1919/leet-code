class Solution {
    public String truncateSentence(String s, int k) {
        String parts[] = s.split(" ");
        String si=parts[0];
        for(int i=1;i<k;i++){
          si=si+" "+parts[i];
        }
        return si;
    }
}