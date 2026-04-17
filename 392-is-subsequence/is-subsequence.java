class Solution {
   
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int c=0;
        for(int i=0;i<t.length();i++){
            if(j<s.length()){
           if(s.charAt(j)==t.charAt(i)){
                j++;
                 c++;
              
            }
             

           }
        }
        if(c==s.length()){
            return true;
        }
        return false;
    }
}