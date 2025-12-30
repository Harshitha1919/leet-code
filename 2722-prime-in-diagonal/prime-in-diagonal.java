class Solution {
    boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
     
      int max1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==j){
                  if(isPrime(nums[i][j])){
                   max1= Math.max(nums[i][j],max1);
                  }
                }
                else if((i+j)==nums.length-1){
                    if(isPrime(nums[i][j])){
                   max1= Math.max(nums[i][j],max1);
                  }
                }
                

            }
        }
        if(max1<=0){
                    return 0;
                }
       
        return max1;
    
    }
}