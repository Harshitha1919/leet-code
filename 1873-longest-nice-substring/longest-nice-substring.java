class Solution {
    public String longestNiceSubstring(String s) {
String ans="";
     int  max1=0;
      for(int i=0;i<s.length();i++){
         HashSet<Character> hs=new HashSet<>();
        for(int j=i;j<s.length();j++){
            hs.add(s.charAt(j));
           boolean valid=true;
            for (char c : hs) {
            if(Character.isLowerCase(c)){
                int ascii=(int)(c)-32;
                char ch=(char)ascii;
                if(!hs.contains(ch)){
                    valid=false;
                     break;
                }
            }
            else{
                 int ascii=(int)(c)+32;
                char ch=(char)ascii;
                if(!hs.contains(ch)){
                    valid=false;
                      break;
                }
            }

            }
        if(valid){
                    if((j-i+1)>max1){
                    ans=s.substring(i,j+1);
                     max1=j-i+1;
                    }
                   
                }
        }
            
        }
      
      return ans;  
    }
}