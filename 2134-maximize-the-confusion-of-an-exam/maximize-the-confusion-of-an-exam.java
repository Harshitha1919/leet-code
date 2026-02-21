class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int tc=0;
        int fc=0;
        int l=0;
        int max1=0;
        for(int r=0;r<answerKey.length();r++){
            if(answerKey.charAt(r)=='T'){
                tc++;
            }
            else{
                fc++;
            }
           
            if(Math.min(tc,fc)>k){
                
                if(answerKey.charAt(l)=='T'){
                    tc--;
                }
                else{
                    fc--;
                }
                l++;
            }
               max1=Math.max(max1,r-l+1);
        }
        return max1;
    }
}