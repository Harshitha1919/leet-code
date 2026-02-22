class Solution {
    public int numberOfSubstrings(String s) {
        int ac=0,bc=0,cc=0;
        int total=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='a'){
                ac++;
            }
            else if(s.charAt(r)=='b'){
                bc++;
            }
            else{
                cc++;
            }
            while(ac>0 && bc>0 && cc>0){
                total=total+s.length()-r;
                if(s.charAt(l)=='a'){
                    ac--;
                    
                }
                else if(s.charAt(l)=='b'){
                    bc--;
                    
                }
                else{
                    cc--;
                    
                }
                l++;
            }
        }
        return total;

    }
}