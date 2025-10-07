class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      
        int total=numBottles;
        

          while((numBottles>=numExchange)){
             int k1=numBottles/numExchange;
             total=total+k1;
            
             numBottles=k1+(numBottles%numExchange);

          }
     
          return total;
    }
}