class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c0=0;
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                c0++;
            }
            else{
                c1++;
            }
        }
       String ans="";
        c1--;
        for(int i=0;i<c1;i++){
              ans=ans+"1";
        }
        for(int i=0;i<c0;i++){
              ans=ans+"0";
        }
        ans=ans+"1";
        return ans;
    }
}