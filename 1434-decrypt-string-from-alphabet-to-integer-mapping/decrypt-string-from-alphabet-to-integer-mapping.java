class Solution {
    public String freqAlphabets(String s) {
        String sa="";
        for(int i=0;i<s.length();i++){
            String num="";
            if((i+2)<s.length() && s.charAt(i+2)=='#'){
                 num=""+s.charAt(i)+s.charAt(i+1);
                int number=Integer.parseInt(num);
                sa=sa+(char)(number-1+'a');
                i=i+2;
            }
            else{
                 num=""+s.charAt(i);
                int number=Integer.parseInt(num);
                sa=sa+(char)(number-1+'a');
                
            }
        }
        return sa;
    }
}