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
         String a=ans[ans.length-1];
                String b=ans[0];
        if(a.charAt(a.length()-1)!=b.charAt(0)){
            return false;
        }
          return true;
    }
}