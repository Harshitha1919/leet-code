class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        int count1=0;
        for(int i=0;i<word.length();i++){
            int k=word.charAt(i);
            if(k>=65 && k<=90){
               count++; 
            }
            else{
                count1++;
            }
        }
       if(count==1){
        int k=word.charAt(0);
        if(k>=65 && k<=90){
            return true;
        }
          
        
       }
        if(count==word.length()){
            return true;
        }
        else if(count1==word.length()){
            return true;
        }
    return false;
    }
}