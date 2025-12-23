class Solution {
    public int minSteps(String s, String t) {
        int f[]=new int[26];
        int f1[]=new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            f[c-'a']=f[c-'a']+1;
        }
         for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            f1[c-'a']=f1[c-'a']+1;
        }
    
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(f1[c-'a']>0){
                 f1[c-'a']=f1[c-'a']-1;
                
            }
            else{
                count++;
            }
        }
        int f2[]=new int[26];
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            f2[c-'a']=f2[c-'a']+1;
        }
         for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(f2[c-'a']>0){
                 f2[c-'a']=f2[c-'a']-1;
                
            }
            else{
                count++;
            }
        }
        return count;
    }
}