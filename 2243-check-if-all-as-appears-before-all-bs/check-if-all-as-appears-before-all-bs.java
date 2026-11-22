class Solution {
    public boolean checkString(String s) {
        int j=0;
        int count1=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'){
                j=i;
                break;
            }
            else{
                count1++;
            }
           
           
        }
       if(count1!=s.length()){
       
               for(int i=j;i<s.length();i++){
            if(s.charAt(i)!='b'){
               return false;
            }
           
        }
       }
         
       
        
    return true;
    }
}