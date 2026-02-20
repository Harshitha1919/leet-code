class Solution {
    public int characterReplacement(String s, int k) {
            HashMap<Character,Integer> hs=new HashMap<>();
            int size=0;
           int l=0;
        for(int r=0;r<s.length();r++){
              hs.put(s.charAt(r),hs.getOrDefault(s.charAt(r),0)+1);
               int max1=0;
                int sum=0;
              for(char key:hs.keySet()){
                max1=Math.max(max1,hs.get(key));
                sum=sum+hs.get(key);
              }
              sum=sum-max1;
              if(sum<=k){
                size=Math.max(size,r-l+1);
              }
             else {
    hs.put(s.charAt(l), hs.get(s.charAt(l)) - 1);
    l++;
}
        }
        return size;
    }
}