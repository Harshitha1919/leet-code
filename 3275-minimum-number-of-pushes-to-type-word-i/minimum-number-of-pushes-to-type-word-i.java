class Solution {
    public int minimumPushes(String word) {
        int c=0;
        for(int i=0;i<word.length();i++){
            if(i<=7){
                c++;
            }
            else if(i<=15){
                c=c+2;
            }
            else if(i<=23){
                c=c+3;
            }
            else{
                c=c+4;
            }
        }
        return c;
    }
}