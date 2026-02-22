class Solution {
    public long countVowels(String word) {
          
         long count=0;
        for(int r=0;r<word.length();r++){
            if(word.charAt(r)=='a' || word.charAt(r)=='e' || word.charAt(r)=='i' || word.charAt(r)=='o' || word.charAt(r)=='u'){
                count+=(long)(r+1)*(word.length()-r);
            }
         
        }
       
        
        return count;
    }
}