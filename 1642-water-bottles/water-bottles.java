class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;

        while (numBottles >= numExchange) {
            int exchanged = numBottles / numExchange;
            total += exchanged;
            numBottles = exchanged + (numBottles % numExchange);
        }

        return total;
    }
}
