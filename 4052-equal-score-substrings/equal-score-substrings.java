class Solution {
    public boolean scoreBalance(String s) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'a'+1;
            sum=sum+num;
        }
        int num=0;
        int half=sum/2;
        if(sum%2==0){
        for(int i=0;i<s.length();i++){
             num=s.charAt(i)-'a'+1;
            if(sum2<half){
                sum2=sum2+num;
                if(sum2==half){
                    return true;
                }
            }
            
           
        }
        }
        return false;
        
    }
}