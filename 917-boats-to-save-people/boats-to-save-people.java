class Solution {
    public int numRescueBoats(int[] p, int limit) {
       Arrays.sort(p);
       int  sum=0;
       int i=0;
       int j=p.length-1;
      
      
  
       while(i<=j){
        if(p[i]+p[j]<=limit){
            sum++;


           
            i++;
            j--;
            }
       else if(p[i]+p[j]>limit){
              j--;
              sum++;

        }
        else{
            i++;

        }
       }
     

       return sum;
    }
}