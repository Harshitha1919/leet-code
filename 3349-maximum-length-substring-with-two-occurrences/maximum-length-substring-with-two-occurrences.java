class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int max1=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int r=0;r<s.length();r++){
            hs.put(s.charAt(r),hs.getOrDefault(s.charAt(r),0)+1);
               while(hs.get(s.charAt(r))>2){
            
                 
                    hs.put(s.charAt(l),hs.get(s.charAt(l))-1);
                   
                   
             
                    l++;
                   
               }
               if(hs.get(s.charAt(r))<=2){
                max1=Math.max(max1,r-l+1);
               }
        }
        return max1;
    }
}