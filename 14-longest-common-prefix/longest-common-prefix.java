class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        String ans="";
        int j=0;
        int c=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            min=Math.min(strs[i].length(),min);
        }
        while(j<min){
        for(int i=1;i<strs.length;i++){
            String k=strs[i];
            if(k.charAt(j)!=s.charAt(j)){
                return ans;
            }
        }
        ans=ans+s.charAt(j);
           
             j++;
        
        }
        return ans;
    }
}