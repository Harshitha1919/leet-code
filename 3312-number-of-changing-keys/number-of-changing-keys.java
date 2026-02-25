class Solution {
    public int countKeyChanges(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            int a=(int)s.charAt(i);
              int b=(int)s.charAt(i+1);
          
            if(a!=b && Math.abs(a-b)!=32 ){
               c++;
            }
        }
        return c;
    }
}