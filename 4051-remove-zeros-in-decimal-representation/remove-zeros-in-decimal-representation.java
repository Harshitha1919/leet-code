class Solution {
    public long removeZeros(long n) {
      StringBuilder sr=new StringBuilder(String.valueOf(n));
      for(int i=0;i<sr.length();i++){
        if(sr.charAt(i)=='0'){
          sr.deleteCharAt(i);
          i--;
        }
      }
      String str=sr.toString();
      long num = Long.parseLong(str); 
      return num;
    }
}