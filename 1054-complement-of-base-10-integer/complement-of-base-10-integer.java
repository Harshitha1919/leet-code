class Solution {
    public int bitwiseComplement(int n) {
        String bin=Integer.toBinaryString(n);
        String ans="";
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                ans=ans+"0";
            }
            else{
                ans=ans+"1";
            }
        }
        int k=Integer.parseInt(ans,2);
        return k;
    }
}