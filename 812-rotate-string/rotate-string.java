class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb1=new StringBuilder(goal);
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
          char ch=   sb.charAt(0);
          sb.deleteCharAt(0);
          sb.append(ch);
          if(sb.toString().equals(sb1.toString())){
            return true;
          }
         
             
        }
        return false;
    }
}