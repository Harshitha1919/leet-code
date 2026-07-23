class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int min=Math.min(word1.length(),word2.length());
        int i=0;
        for( i=0;i<min;i++){
               ans=ans+word1.charAt(i);
               ans=ans+word2.charAt(i);
        }
        if(word1.length()>min){
            while(i<word1.length()){
                ans=ans+word1.charAt(i);
                i++;
            }
        }
        else{
              while(i<word2.length()){
                ans=ans+word2.charAt(i);
                i++;
            }
        }
        return ans;

    }
}