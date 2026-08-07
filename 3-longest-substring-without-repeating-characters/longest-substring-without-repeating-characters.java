class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max1=0;
        HashSet<Character> hs=new HashSet<>();
        for(right=0;right<s.length();right++){
     
           
         
           while(hs.contains(s.charAt(right))){
                 
                    hs.remove(s.charAt(left));
                    left++;
           }
  
           hs.add(s.charAt(right));
                         max1=Math.max(right-left+1,max1);
        }
        return max1;
    }
}