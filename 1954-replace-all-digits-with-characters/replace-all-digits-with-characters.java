class Solution {
    public String replaceDigits(String s) {
        String ans="";
        for(int i=0;i<s.length()-1;i=i+2){
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            ans=ans+ch;
            int k=ch1-'0';
          char l= (char)(ch+k);
            ans=ans+l;
        }
          // Handle last character if string length is odd
        if (s.length() % 2 != 0) {
            ans += s.charAt(s.length() - 1);
        }

        return ans;
    }
}