class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=' ' && i!=s.length()-1){
            sb2.append(s.charAt(i));
           }
           else if(i==s.length()-1){
            sb2.append(s.charAt(i));
             sb.append(sb2.reverse().toString());
           }
           else{
            sb.append(sb2.reverse().toString());
            sb.append(' ');
            sb2.setLength(0);
           }
        }
      
        return sb.toString();
    }
}