class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
       
      int sum=prices[0]+prices[1];
           int n=money-sum;
           if(n<0){
            return money;
           }
           return n;
    }
}