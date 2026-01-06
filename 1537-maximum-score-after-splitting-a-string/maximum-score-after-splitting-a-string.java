class Solution {
    public int maxScore(String s) {
        int count=0;
        int count1=0;
        int max1=0;
        for(int i=0;i<s.length()-1;i++){
            count1=0;
            if(s.charAt(i)=='0'){
                count++;
            }
          for(int j=i+1;j<s.length();j++){
             if(s.charAt(j)=='1'){
                count1++;
             }
          }
          max1=Math.max(max1,(count+count1));
        }
        return  max1;
    }
}