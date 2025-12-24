class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int c=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                count++;
                if(count==c){
                    ans++;
                }
            }
            else{
                c++;
                if(count==c){
                    ans++;
                }
            }
        }
        return ans;
    }
}