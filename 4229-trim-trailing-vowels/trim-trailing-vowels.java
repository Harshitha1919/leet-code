class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=s.length()-1;i>=0;i--){
            if("aeioue".indexOf(s.charAt(i))!=-1){
                sb.deleteCharAt(i);
            }
            else{
                break;
            }

        }
      return  sb.toString();
    }
}