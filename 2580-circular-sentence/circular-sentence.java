class Solution {
    public boolean isCircularSentence(String s) {
        String [] ans=s.split(" ");
        for(int i=0;i<ans.length-1;i++){
                String a=ans[i];
                String b=ans[i+1];
                if(a.charAt(a.length()-1)!=b.charAt(0)){
                     return false;
                }
        }
        
   if(ans[ans.length - 1].charAt(ans[ans.length - 1].length() - 1) 
    != ans[0].charAt(0)){

            return false;
        }
          return true;
    }
}