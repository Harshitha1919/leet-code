class Solution {
    public String convertDateToBinary(String date) {
    String k[]=date.split("-");
    String ans="";
    for(int i=0;i<k.length;i++){
        
        int num=Integer.parseInt(k[i]);
        String binary=Integer.toBinaryString(num);
        if(i!=0){
        ans=ans+"-"+binary;
        }
        else{
            ans=ans+binary;
        }
    }
    return ans;
    }
}