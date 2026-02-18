class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String s=Integer.toBinaryString(i);
            int c=0;
           
            for(int k=0;k<s.length();k++){
                  if(s.charAt(k)=='1'){
                    c++;
                  }
            } 
             if(c<2){
                continue;
            }
            int h=0;
                  for(int j=2;j<=Math.sqrt(c);j++){
                   if(c%j==0){
                        h=-1;
                       break;
                   }
                  }
                  if(h!=-1){
                    count++;
                  }
                  
            
        }
        return count;
    }
}