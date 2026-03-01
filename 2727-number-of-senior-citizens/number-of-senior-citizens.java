class Solution {
    public int countSeniors(String[] d) {
        int c=0;
   
       for(int i=0;i<d.length;i++){
        String k=d[i];
          String p=""+k.charAt(11)+k.charAt(12);
        int n=Integer.parseInt(p);
        if(n>60){
            c++;
        }
       }
       return c;
    }
}