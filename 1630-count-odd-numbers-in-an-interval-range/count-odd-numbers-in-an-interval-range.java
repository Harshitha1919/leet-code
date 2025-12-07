class Solution {
    public int countOdds(int low, int high) {
        // int count=0;
        
        // int i=low;
        // while(i>=low && i<=high){
        //        if(i%2!=0){
        //         count++;
        //         i=i+2;
        //        }
        //        else{
        //         i=i+1;
        //        }
        // }
        // return count;
          if(low%2==0 && high%2==0){
            return (high-low)/2;
          }
          else{
            return ((high-low)/2)+1;
          }
    }
}