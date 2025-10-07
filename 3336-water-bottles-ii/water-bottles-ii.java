
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;        
        int empty = numBottles;      

        while (empty >= numExchange) {
            int exchange = 1;        
            ans += exchange;         
            empty = empty - numExchange + exchange; 
            numExchange++;         
        }

        return ans;
    }
}
