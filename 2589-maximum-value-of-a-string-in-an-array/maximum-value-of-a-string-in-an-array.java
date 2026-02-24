class Solution {
    public int maximumValue(String[] strs) {
         int max1=0;
        for(int j=0;j<strs.length;j++){
            String s=strs[j];
           int c=-1;
            for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                max1=Math.max(max1,s.length());
                c=0;
                break;
            }
            }
           if(c==-1){
                int num=Integer.parseInt(s);
                max1=Math.max(max1,num);
            }
        }
        return max1;
    }
}